package com.itmayiedu.test01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itmayiedu.entity.UserEntity;
import com.itmayiedu.test01.mapping.UserMapper1;
import com.itmayiedu.test02.mapping.UserMapper2;

@Service
public class UserService1 {
	@Autowired
	private UserMapper1 userMapper1;
	
	@Autowired
	private UserMapper2 userMapper2;
	
	@Transactional
	 public int addUser1 (UserEntity userEntity){
		 userMapper2.addUser(userEntity.getName(), userEntity.getAge());
		 userMapper1.addUser(userEntity.getName(), userEntity.getAge());
		 return 1;
	 }
	
	public List<UserEntity> select(Long id){
		List<UserEntity> select = userMapper1.select(id);
		return select;
	}
}
