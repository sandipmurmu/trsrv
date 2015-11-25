package com.trsrv.model;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.trsrv.config.PersistenceConfig;
import com.trsrv.repository.BusinessRepository;
import com.trsrv.repository.UserRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=PersistenceConfig.class)
public class TransrvTest {

	@Autowired
	private BusinessRepository bizRepo;
	
	@Autowired
	private UserRepository userRepo;
	
	
	
	@Test
	public void saveBiz(){
		Business biz = new Merchant();
		//biz.setType("MERCHANT");
		bizRepo.save(biz);
	}
	
	@Test
	public void saveUser(){
		User usr = new User();
		usr.setName("John Rovers");
		userRepo.save(usr);
		
	}
}
