package com.trsrv.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;


@Entity
public class Merchant extends Business {

	private BusinessType type = BusinessType.MERCHANT;
	
	private String merchantField1;
	
	private String merchantField2;

	public String getMerchantField1() {
		return merchantField1;
	}

	public void setMerchantField1(String merchantField1) {
		this.merchantField1 = merchantField1;
	}

	public String getMerchantField2() {
		return merchantField2;
	}

	public void setMerchantField2(String merchantField2) {
		this.merchantField2 = merchantField2;
	}
}
