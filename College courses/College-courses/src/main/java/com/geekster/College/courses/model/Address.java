package com.geekster.College.courses.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addId;
    private  String landmark;
    private String zipcode;
    private String district;
    private String state;
    private String country;

    @OneToOne(mappedBy = "address")
    private Student student;


}
