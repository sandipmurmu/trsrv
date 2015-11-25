package com.trsrv.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	private long id;
	
	private long consumerid;
	
	private String name;
	
	private List<Business> business;

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

	public List<Business> getBusiness() {
		return business;
	}

	public void setBusiness(List<Business> business) {
		this.business = business;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
