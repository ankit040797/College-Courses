package com.geekster.College.courses.service;

import com.geekster.College.courses.model.Laptop;
import com.geekster.College.courses.repo.ILaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {

    @Autowired
    ILaptopRepo iLaptopRepo;
    public String addLaptop(Laptop newLaptop) {
        iLaptopRepo.save(newLaptop);
        return "added";
    }


    public List<Laptop> getAllLaptops() {
        return iLaptopRepo.findAll();
    }

    public String deleteLaptop(Long id) {
        iLaptopRepo.deleteById(id);
        return "removed";
    }
}
