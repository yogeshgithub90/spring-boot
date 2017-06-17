package com.eapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.eapp.dao.AddressDAO;
import com.eapp.entity.Address;

@Component
public class AddressServiceImpl implements AddressService{
	@Autowired
	private AddressDAO addressDAO;
	
	@Override
	public Address getAddress(long id){
		return addressDAO.get(Address.class, id);
	}
	
	@Override
	public Address create(Address address){
		return addressDAO.create(address);
	}
}
