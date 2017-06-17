package com.eapp.dao;

import javax.transaction.Transactional;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.eapp.entity.Address;

@Component
@Repository
@Transactional
public class AddressDAOImpl extends GenericDAOImpl<Address> implements AddressDAO{

}
