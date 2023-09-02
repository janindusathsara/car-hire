/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "user")
public class UserEntity {

    @Id
    @Column(name = "UserID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    @Column(name = "UserTitle", nullable = false, length = 5)
    private String uTitle;
    
    @Column(name = "Name", nullable = false, length = 100)
    private String uname;

    @Column(name = "Address", nullable = false, length = 255)
    private String uAddress;

    @Column(name = "E-mail", nullable = false, length = 255)
    private String email;

    @Column(name = "DOB", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dob;

    @Column(name = "Phone_No", nullable = false, length = 10)
    private Integer uPhoneNo;

    @Column(name = "UserName", nullable = false, length = 100)
    private String userName;

    @Column(name = "Password", nullable = false, length = 100)
    private String password;
}
