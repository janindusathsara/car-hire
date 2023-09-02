/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.entity;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Getter
@Setter
@ToString
@Entity
@Table(name = "rental")
public class RentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RentID")
    private Integer rentId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Customer_ID", nullable = false)
    private CustomerEntity customerEntity;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "VehicleID", nullable = false)
    private CarEntity car;

    @Column(name = "From_Date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fromDate;

    @Column(name = "To_Date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date toDate;

    @Column(name = "PerDayRent", nullable = false)
    private Double perDayRent;

    @Column(name = "Advance", nullable = false)
    private Double advance;

    @Column(name = "Key_Money")
    private Double keyMoney;

    @Column(name = "Total", nullable = false)
    private Double total;

    @Column(name = "Balance")
    private Double balance;

    @Column(name = "UserID", nullable = false)
    private Integer userId;

    @Column(name = "Is_Returned")
    private Boolean isReturned;

}
