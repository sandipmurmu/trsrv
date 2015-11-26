package com.trsrv.model;

import java.sql.Date;
import java.util.Currency;

import javax.persistence.Entity;



public class CurrenyExchange {

	private Date date;
	
	private String currcode;
	
	private Currency rate;
}
