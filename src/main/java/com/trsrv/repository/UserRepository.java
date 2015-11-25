package com.trsrv.repository;

import org.springframework.data.repository.CrudRepository;

import com.trsrv.model.User;

public interface UserRepository extends CrudRepository<User, Long>{

}
