
package com.itmayiedu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "users")
public class UserEntity {
	
	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	private Integer age;

	public Long getId() {

		return id;
	}

	public void setId(Long id) {

		this.id = id;
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {

		this.name = name;
	}

	public Integer getAge() {

		return age;
	}

	public void setAge(Integer age) {

		this.age = age;
	}

}
