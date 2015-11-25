package com.trsrv.model;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Corporate extends Business implements Serializable {

	private BusinessType type = BusinessType.CORPORATE;
}
