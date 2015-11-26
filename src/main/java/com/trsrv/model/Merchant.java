package com.trsrv.model;

import javax.persistence.Entity;


@Entity
public class Merchant extends Business {

	
	private BusinessType type = BusinessType.MERCHANT;
	
	
	
}
