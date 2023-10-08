package com.geekster.College.courses.repo;

import com.geekster.College.courses.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepo extends JpaRepository<Address,Long> {
}
