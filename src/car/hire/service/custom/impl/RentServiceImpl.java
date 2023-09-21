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
import car.hire.dto.RentReturnDto;
import car.hire.entity.CarEntity;
import car.hire.entity.CustomerEntity;
import car.hire.entity.RentEntity;
import car.hire.service.custom.RentService;
import java.time.Instant;
import java.time.LocalDate;
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

        Double total = (diff.getDays() + 1) * dto.getPerDayRent();
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
                nowTime,
                null);

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

    @Override
    public ArrayList<RentDto> getActiveRentals() throws Exception {
        ArrayList<RentEntity> rentEntity = rentDao.getOverdueRentals();
        ArrayList<RentDto> rentDtos = new ArrayList<>();

        LocalDate now = LocalDate.now();

        for (RentEntity entity : rentEntity) {
            Period diff = Period.between(now, fromDateToLocalDate(entity.getToDate()));
            Period diff2 = Period.between(fromDateToLocalDate(entity.getFromDate()), now);
            if ((diff.getDays() > 0) & (diff2.getDays() > 0)) {
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
    public ArrayList<RentDto> getOldRentals() throws Exception {
        ArrayList<RentEntity> rentEntity = rentDao.getOldRentals();
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
    public RentReturnDto getRentData(Integer rentId) throws Exception {
        RentEntity entity = rentDao.getRentData(rentId);
        LocalDate fromDate = fromDateToLocalDate(entity.getFromDate());
        LocalDate toDate = fromDateToLocalDate(entity.getToDate());
        LocalDate now = LocalDate.now();

        Period diff = Period.between(fromDate, toDate);
        Period diff1 = Period.between(fromDate, now);
        Period diff2 = Period.between(now, toDate);
        Double newTotal = 0.0;
        Double finalBalance = 0.0;

        if (diff2.getDays() >= 0) {

            newTotal = (diff1.getDays() + 1) * entity.getPerDayRent();
            finalBalance = newTotal - (entity.getAdvance() + entity.getKeyMoney());

        } else {
            newTotal = (entity.getTotal()) + ((diff2.getDays() * -1) * (entity.getPerDayRent() * 1.5));
            finalBalance = newTotal - (entity.getAdvance() + entity.getKeyMoney());
        }

        RentReturnDto dto = new RentReturnDto(
                entity.getRentId(),
                entity.getCustomerEntity(),
                entity.getCar(),
                entity.getFromDate(),
                entity.getToDate(),
                entity.getPerDayRent(),
                entity.getAdvance(),
                entity.getKeyMoney(),
                newTotal,
                finalBalance,
                entity.getUserId());
        return dto;
    }

    @Override
    public String returnCar(RentReturnDto dto) throws Exception {
        RentEntity entity = new RentEntity(
                dto.getRentId(), 
                dto.getCustomerEntity(), 
                dto.getCar(), 
                dto.getFromDate(), 
                dto.getToDate(), 
                dto.getPerDayRent(), 
                dto.getAdvance(), 
                dto.getKeyMoney(), 
                dto.getTotal(), 
                dto.getFinalBalance(), 
                dto.getUserId(), 
                Boolean.TRUE, 
                rentDao.getRentData(dto.getRentId()).getBillDate(), 
                rentDao.getRentData(dto.getRentId()).getBillTime(),
                LocalDate.now());
        
        return rentDao.returnCar(entity);
    }

}
