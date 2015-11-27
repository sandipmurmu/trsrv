package com.trsrv.model;

import javax.persistence.Entity;

@Entity
public class Remittance extends Business {

	private BusinessType businssType = BusinessType.DISTRIBUTOR;
	
	private Boolean isSuper;
	
	private Boolean isAgent;
	
	private Remittance parent;
}
