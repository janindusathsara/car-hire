/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author DELL i5
 */
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name = "car")
public class CarEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "VehicleID")
    private Integer vehicleId;
    
    @Column(name = "Vehicle_No", nullable = false, length = 8)
    private String vehicleNumber;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Category_ID", nullable = false)
    private CarCategoryEntity carCategoryEntity;
    
    @Column(name = "Model", nullable = false, length = 50)
    private String model;
    
    @Column(name = "Brand", nullable = false, length = 50)
    private String brand;
    
    @Column(name = "Year", nullable = false, length = 4)
    private Integer year;
    
    @Column(name = "Colour", nullable = false, length = 20)
    private String colour;
    
    @Column(name = "Chassis_No", nullable = false, length = 17)
    private String chassisNo;
    
    @Column(name = "PricePerDay", nullable = false)
    private Double pricePerDay;
    
    private Boolean isAvailable;
    
    @OneToMany(mappedBy = "rentId", targetEntity = RentEntity.class)
    private List<RentEntity> rentEntitys;

}
