package com.trsrv.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private long consumerid;
	
	private String name;
	
	@OneToMany(mappedBy="user")
	private Set<Business> business;

	@OneToOne
	private Contact contact;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getConsumerid() {
		return consumerid;
	}

	public void setConsumerid(long consumerid) {
		this.consumerid = consumerid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Business> getBusiness() {
		return business;
	}

	public void setBusiness(Set<Business> business) {
		this.business = business;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}
}
