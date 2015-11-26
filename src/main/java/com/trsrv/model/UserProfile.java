package com.trsrv.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class UserProfile {

	
	private Language lang;
	
	private String panCard;
	
	private String nameOnPanCard;
	
	
	private Long lastLoginTime;
	
	private int loginFailedCount;
	
	
	
	
}
