package com.geekster.College.courses.controller;

import com.geekster.College.courses.model.Laptop;
import com.geekster.College.courses.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopController {
    @Autowired
    LaptopService laptopService;

    @PostMapping("laptop")
    public String addLaptop(@RequestBody Laptop newLaptop){
        return laptopService.addLaptop(newLaptop);
    }

    @GetMapping("laptops")
    public List<Laptop> getAllLaptops(){
        return  laptopService.getAllLaptops();
    }


    @DeleteMapping("laptop/id/{id}")
    public String deleteLaptop(@PathVariable Long id){
        return laptopService.deleteLaptop(id);
    }
}
