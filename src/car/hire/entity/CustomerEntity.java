/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.entity;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
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
@Table(name = "customer")
public class CustomerEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CustID", nullable = false)
    private Integer custId;
    
    @Column(name = "CustTitle", nullable = false, length = 5)
    private String custTitle;
    
    @Column(name = "CustName", nullable = false, length = 100)
    private String custName;
    
    @Column(name = "CustAddress", nullable = false, length = 255)
    private String custAddress;
    
    @Column(name = "NIC", nullable = false, length = 12)
    private String nic;
    
    @Column(name = "DOB", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dob;
    
    @Column(name = "PhoneNo", nullable = false, length = 10)
    private Integer custPhoneNo;
    
    private Boolean isRented;
    
    @OneToMany(mappedBy = "rentId", targetEntity = RentEntity.class)
    private List<RentEntity> rentEntitys;
}
