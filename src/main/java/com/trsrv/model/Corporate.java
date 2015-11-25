package com.trsrv.model;

import java.util.Set;

import javax.persistence.Entity;

@Entity
public class Corporate extends Business{

	private Set<Role> roles;
	
	private BusinessType type = BusinessType.CORPORATE;
}
