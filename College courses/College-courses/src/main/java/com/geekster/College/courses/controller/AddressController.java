package com.geekster.College.courses.controller;

import com.geekster.College.courses.model.Address;
import com.geekster.College.courses.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping("address")
    public String addAddress(@RequestBody Address newAddress){
        return addressService.addAddres(newAddress);
    }

    @GetMapping("addresses")
    public List<Address> getAddress(){
        return addressService.getAddress();
    }

    @PutMapping("update_address")
    public String updateAddress(@RequestBody Address address){
        return addressService.updateAddress(address);
    }

    @DeleteMapping("address/id/{id}")
    public String deleteAddress(@PathVariable Long id){
        return addressService.deleteAddress(id);
    }
}
