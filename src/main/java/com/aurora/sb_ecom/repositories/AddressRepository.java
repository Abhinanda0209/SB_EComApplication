package com.aurora.sb_ecom.repositories;

import com.aurora.sb_ecom.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
