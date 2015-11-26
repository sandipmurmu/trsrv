package com.trsrv.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Contact {

	@OneToMany(mappedBy="contact")
	private Set<Phone> phones = new HashSet<Phone>(0);;
	
	@OneToMany(mappedBy="contact")
    private Set<Address> address = new HashSet<Address>(0);;
	
    @OneToMany(mappedBy="contact")
	private Set<Email> emails = new HashSet<Email>(0);;
	
	@Id
	public long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Set<Phone> getPhones() {
		return phones;
	}

	public void setPhones(Set<Phone> phones) {
		this.phones = phones;
	}

	public Set<Address> getAddress() {
		return address;
	}

	public void setAddress(Set<Address> address) {
		this.address = address;
	}

	public Set<Email> getEmails() {
		return emails;
	}

	public void setEmails(Set<Email> emails) {
		this.emails = emails;
	}
}
