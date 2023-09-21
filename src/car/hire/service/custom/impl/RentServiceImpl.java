/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.service.custom.impl;

import car.hire.dao.DaoFactory;
import car.hire.dao.custom.RentDao;
import car.hire.dto.CarDto;
import car.hire.dto.CustomerDto;
import car.hire.dto.RentDto;
import car.hire.entity.CarEntity;
import car.hire.entity.CustomerEntity;
import car.hire.entity.RentEntity;
import car.hire.service.custom.RentService;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author DELL i5
 */
public class RentServiceImpl implements RentService {

    RentDao rentDao = (RentDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.RENT);

    @Override
    public ArrayList<RentDto> getAllRentals() throws Exception {
        ArrayList<RentEntity> rentEntity = rentDao.getAllRentals();
        ArrayList<RentDto> rentDtos = new ArrayList<>();

        for (RentEntity entity : rentEntity) {
            RentDto dto = new RentDto(
                    entity.getRentId(),
                    entity.getCustomerEntity(),
                    entity.getCar(),
                    fromDateToLocalDate(entity.getFromDate()),
                    fromDateToLocalDate(entity.getToDate()),
                    entity.getPerDayRent(),
                    entity.getAdvance(),
                    entity.getKeyMoney());
            rentDtos.add(dto);
        }
        return rentDtos;
    }

    @Override
    public ArrayList<RentDto> getOverdueRentals() throws Exception {
        ArrayList<RentEntity> rentEntity = rentDao.getOverdueRentals();
        ArrayList<RentDto> rentDtos = new ArrayList<>();

        LocalDate now = LocalDate.now();

        for (RentEntity entity : rentEntity) {
            Period diff = Period.between(now, fromDateToLocalDate(entity.getToDate()));
            if (diff.getDays() < 0) {
                RentDto dto = new RentDto(
                        entity.getRentId(),
                        entity.getCustomerEntity(),
                        entity.getCar(),
                        fromDateToLocalDate(entity.getFromDate()),
                        fromDateToLocalDate(entity.getToDate()),
                        entity.getPerDayRent(),
                        entity.getAdvance(),
                        entity.getKeyMoney());
                rentDtos.add(dto);
            }

        }
        return rentDtos;
    }

    @Override
    public CustomerDto searchCustomer(Integer custId) throws Exception {
        CustomerEntity entity = rentDao.searchCustomer(custId);
        CustomerDto dto = new CustomerDto(
                entity.getCustId(),
                entity.getCustTitle(),
                entity.getCustName(),
                entity.getCustAddress(),
                entity.getNic(),
                entity.getDob(),
                entity.getCustPhoneNo());
        return dto;
    }

    @Override
    public CarDto searchVehicle(Integer vehicleId) throws Exception {
        CarEntity entity = rentDao.searchVehicle(vehicleId);
        CarDto dto = new CarDto(
                entity.getVehicleId(),
                entity.getVehicleNumber(),
                entity.getCarCategoryEntity(),
                entity.getModel(),
                entity.getBrand(),
                entity.getYear(),
                entity.getColour(),
                entity.getChassisNo(),
                entity.getPricePerDay());
        return dto;
    }

    @Override
    public CustomerEntity getCustomerEntity(Integer custId) throws Exception {
        return rentDao.searchCustomer(custId);
    }

    @Override
    public CarEntity getVehicleEntity(Integer carId) throws Exception {
        return rentDao.searchVehicle(carId);
    }

    @Override
    public String newRent(RentDto dto) throws Exception {
        LocalDate fromDate = dto.getFromDate();
        LocalDate toDate = dto.getToDate();
        LocalDate now = LocalDate.now();
        LocalTime nowTime = LocalTime.now();

        Period diff = Period.between(fromDate, toDate);

        Double total = diff.getDays() * dto.getPerDayRent();
        RentEntity entity = new RentEntity(
                dto.getRentId(),
                dto.getCustomerEntity(),
                dto.getCar(),
                convertToDateUsingInstant(fromDate),
                convertToDateUsingInstant(toDate),
                dto.getPerDayRent(),
                dto.getAdvance(),
                dto.getKeyMoney(),
                total,
                (total - dto.getAdvance()),
                1,
                Boolean.FALSE,
                now,
                nowTime);

        String result = rentDao.newRent(entity);
        return result;
    }

    public Date convertToDateUsingInstant(LocalDate date) {
        return java.util.Date.from(date.atStartOfDay()
                .atZone(ZoneId.systemDefault())
                .toInstant());
    }

    public LocalDate fromDateToLocalDate(Date date) {
        return Instant.ofEpochMilli(date.getTime())
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }

}
