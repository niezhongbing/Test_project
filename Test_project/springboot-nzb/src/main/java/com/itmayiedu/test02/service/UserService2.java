package com.itmayiedu.test02.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itmayiedu.entity.UserEntity;
import com.itmayiedu.test02.mapping.UserMapper2;

@Service
public class UserService2 {
	@Autowired
	private UserMapper2 userMapper2;
	
	 public int addUser2 (UserEntity userEntity){
		 return userMapper2.addUser(userEntity.getName(), userEntity.getAge());
	 }
}
