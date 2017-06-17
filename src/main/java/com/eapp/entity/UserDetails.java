package com.eapp.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="user_details")
@NamedQuery(name="UserDetails.findByUsernameAndPassword", query="from UserDetails ud where ud.username=:username and ud.password=:password")
public class UserDetails implements Serializable{
	
	public static final String FIND_USER_BY_USERNAME_AND_PASSWORD = "UserDetails.findByUsernameAndPassword";
	@Column(name="password")
	private String password;

	@Column(name="user_name")
	private String username;

	public UserDetails() {
		super();
	}

	public UserDetails(String name, String role, String username, String password) {
		super();
		this.name = name;
		this.role = role;
		this.username = username;
		this.password = password;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 100000L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="user_details_seq")
	@SequenceGenerator(
		name="user_details_seq",
		sequenceName="user_details_seq"
	)
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="role")
	private String role;
	
	@OneToOne
	@JoinColumn(name = "address_id", nullable = false)
	private Address addresses = null;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Address getAddresses() {
		return addresses;
	}

	public void setAddresses(Address addresses) {
		this.addresses = addresses;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
