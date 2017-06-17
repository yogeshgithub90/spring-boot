package com.eapp.dao;

import javax.transaction.Transactional;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.eapp.entity.UserDetails;

@Component
@Repository
@Transactional
public class UserDetailsDAOImpl extends GenericDAOImpl<UserDetails> implements UserDetailsDAO{

}
