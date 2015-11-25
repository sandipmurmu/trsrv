package com.trsrv.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	private long id;
	
	private long consumerid;
	
	private String name;
	
	private Set<Business> business;

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
