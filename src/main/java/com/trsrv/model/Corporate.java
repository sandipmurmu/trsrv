package com.trsrv.model;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Corporate extends Business implements Serializable {

	private BusinessType type = BusinessType.CORPORATE;
	
	private String corporateField1;
	
	private String corporateField2;

	public String getCorporateField1() {
		return corporateField1;
	}

	public void setCorporateField1(String corporateField1) {
		this.corporateField1 = corporateField1;
	}

	public String getCorporateField2() {
		return corporateField2;
	}

	public void setCorporateField2(String corporateField2) {
		this.corporateField2 = corporateField2;
	}
}
