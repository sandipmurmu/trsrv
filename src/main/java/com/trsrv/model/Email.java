package com.trsrv.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Email {

	@Id
	private long id;
	private String name;
}
