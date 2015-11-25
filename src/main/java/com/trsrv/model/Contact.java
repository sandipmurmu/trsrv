package com.trsrv.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;

@Entity
public class Contact {

	private Set<Phone> phones;
	
	private Set<Address> address;
	
	private Set<Email> emails;
}
