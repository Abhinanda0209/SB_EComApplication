package com.aurora.sb_ecom.service;

import com.aurora.sb_ecom.model.User;
import com.aurora.sb_ecom.payload.AddressDTO;

import java.util.List;

public interface AddressService {
    AddressDTO createNewAddress(AddressDTO addressDTO, User user);

    List<AddressDTO> getAddresses();

    AddressDTO getAddressById(Long addressId);

    List<AddressDTO> getUserAddresses(User user);

    AddressDTO updateAddress(Long addressId, AddressDTO addressDTO);

    String deleteAddress(Long addressId);
}
