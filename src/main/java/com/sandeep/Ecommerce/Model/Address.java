package com.sandeep.Ecommerce.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tbl_address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "address_id")
    private Integer Id;
    @Column(name = "address")
    private String address;
    @Column(name = "landmark")
    private String landmark;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "zipcode")
    private String zipcode;
    @Column(name = "state")
    private String state;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
