package com.geekster.College.courses.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long laptopId;
    private  String name;
    private String brand;
    private String price;

    @OneToOne(mappedBy = "laptop")
    private Student student;
}
