package com.trsrv.model;

import javax.persistence.Entity;

@Entity
public class Distributor extends Business {

	private BusinessType type = BusinessType.DISTRIBUTOR;
}
