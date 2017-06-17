package com.eapp.services;

import com.eapp.entity.Address;

public interface AddressService {

	Address getAddress(long id);

	Address create(Address address);

}
