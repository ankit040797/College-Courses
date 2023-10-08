package com.geekster.College.courses.service;

import com.geekster.College.courses.model.Address;
import com.geekster.College.courses.repo.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    IAddressRepo iAddressRepo;


    public String addAddres(Address newAddress) {
        iAddressRepo.save(newAddress);
        return "added";
    }

    public List<Address> getAddress() {
        return iAddressRepo.findAll();
    }


    public String updateAddress(Address address) {
        iAddressRepo.save(address);
        return "update";
    }

    public String deleteAddress(Long id) {
        iAddressRepo.deleteById(id);
        return "delete";
    }
}
