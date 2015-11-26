package com.trsrv.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;


@Entity
public class Merchant extends Business {

	
	private BusinessType type = BusinessType.MERCHANT;
	
	@OneToMany(mappedBy="business")
	private Set<Groups> groups;
	
	
	
}
