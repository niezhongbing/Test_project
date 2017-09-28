package com.itmayiedu.test02.mapping;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;

public interface UserMapper2 {

	@Insert("insert into user values(null,#{name},#{age});")
   // @Options(keyProperty="id",keyColumn="id",useGeneratedKeys=true)  
	public int addUser (@Param("name") String name, @Param("age") Integer age);
	
}
