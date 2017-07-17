package com.cheven.myserver.jdbctest;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface MybatisUserDao {
	@Results({
		@Result(property = "id", column = "id"),
		@Result(property = "firstname", column = "first_name"),
		@Result(property = "lastname", column = "last_name")
	})
	@Select("select * from user where first_name=#{firstName}")
	public User getUser(String firstName);
	
	@Results({
		@Result(property = "id", column = "id"),
		@Result(property = "firstname", column = "first_name"),
		@Result(property = "lastname", column = "last_name")
	})
	@Select("select * from user")
	public List<User> getUserList();
}
