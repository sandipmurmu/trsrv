package com.trsrv.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;


@Entity
public class Merchant extends Business{

	@OneToMany
	private Set<Role> roles = new HashSet<>(0);;
	
	private BusinessType type = BusinessType.MERCHANT;

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
}
