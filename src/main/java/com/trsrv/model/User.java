package com.trsrv.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String consumerid;
	
	private String name;

	private String username;
	
	private String password;

	private long createdDate;
	
	private long modifiedDate;
	
	//@OneToMany(mappedBy="user")
	//private Set<Business> business;

	@OneToMany(cascade=CascadeType.ALL)  
    @JoinTable(name="user_business",  
    	joinColumns={@JoinColumn(name="user_id", referencedColumnName="id")},  
    	inverseJoinColumns={@JoinColumn(name="business_id", referencedColumnName="id")})  
	private Set<Business> business;
	
	@OneToOne
	private UserProfile profile;
	
	@OneToOne
	private Contact contact;
	
	@OneToMany
	private Set<Account> accounts;
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	

	public String getConsumerid() {
		return consumerid;
	}

	public void setConsumerid(String consumerid) {
		this.consumerid = consumerid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(long createdDate) {
		this.createdDate = createdDate;
	}

	public long getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(long modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public UserProfile getProfile() {
		return profile;
	}

	public void setProfile(UserProfile profile) {
		this.profile = profile;
	}
}
