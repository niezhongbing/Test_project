package com.itmayiedu.test01.mapping;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.hibernate.annotations.Cache;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestParam;

import com.itmayiedu.entity.UserEntity;

@CacheConfig(cacheNames = "baseCache")
public interface UserMapper1 {

	@Insert("insert into users values(null,#{name},#{age});")
   // @Options(keyProperty="id",keyColumn="id",useGeneratedKeys=true)  
	public int addUser (@Param("name") String name, @Param("age") Integer age);
	
	@Select("select * from users where id = #{id}")
	@Cacheable
	public List<UserEntity> select(@RequestParam Long id);
}
