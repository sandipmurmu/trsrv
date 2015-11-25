package com.trsrv.model;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class Contact {

	private List<Phone> phones;
	
	private List<Address> address;
	
	private List<Email> emails;
}
