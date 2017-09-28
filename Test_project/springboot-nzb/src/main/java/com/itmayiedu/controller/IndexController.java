
package com.itmayiedu.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itmayiedu.entity.UserEntity;
import com.itmayiedu.exception.MyException;
import com.itmayiedu.mapper.UserMapper;
import com.itmayiedu.test01.service.UserService1;
import com.itmayiedu.test02.service.UserService2;

@Controller
public class IndexController {
	private Logger logger =  LoggerFactory.getLogger(getClass());
	
	@Autowired
	private UserMapper userMapper;

	@Autowired
	private UserService1 userService1;
	
	@Autowired
	private UserService2 userService2;
	
	@Autowired
	private	CacheManager cacheManager;
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}

	
	@ResponseBody
	@RequestMapping(value = "getUserName", method = RequestMethod.GET)
	public UserEntity getUserName(String name) throws Exception {
		return userMapper.findName(name);
	}

	@ResponseBody
	@RequestMapping(value = "addUser", method = RequestMethod.GET)
	public String addUser() throws Exception {
		UserEntity userEntity = new UserEntity();
		userEntity.setAge(3);
		userEntity.setId(3L);
		userEntity.setName("王五3");
		int addUser1 = userService1.addUser1(userEntity);
		return "success";
		
	}
	
	@RequestMapping("/json")
	public String json() throws MyException {
		throw new MyException("发生错误2");
	}
	
	@ResponseBody
	@RequestMapping("/param")
	public String param(@RequestParam(name = "name", defaultValue = "1") String name) throws MyException {
		int i = 1 / 0;
		return "测试打印日志";
	}
	
	@ResponseBody
	@RequestMapping("/selectAll")
	public String selecAll(@RequestParam Long id){
		List<UserEntity> select = userService1.select(id);
		return select.toString();
	}
	
	@ResponseBody
	@RequestMapping("/clearCache")
	public String clearCache(@RequestParam Long id){
		cacheManager.getCache("baseCache").clear();
		return "清除缓存成功";
	}
	
}
