package com.eapp.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address implements Serializable{
	
	public Address(String address) {
		super();
		this.address = address;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 2000L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="address_seq")
	@SequenceGenerator(
		name="address_seq",
		sequenceName="address_seq",
		allocationSize=20
	)
	private Long id;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Column(name = "address")
	private String address;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
