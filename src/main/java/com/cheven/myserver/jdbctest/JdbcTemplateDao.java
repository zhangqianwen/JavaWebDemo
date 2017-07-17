package com.cheven.myserver.jdbctest;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcTemplateDao {
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void createTable() {
		jdbcTemplate.execute("create table user (id integer,firstname varchar(100),lastname varchar(100))");
	}
	
	public void insertData() {
		this.jdbcTemplate.update("insert into user values (1,?,?)","Meimei","Han");
		this.jdbcTemplate.update("insert into user values (1,?,?)","Lei","Li");
	}
	
	public int count() {
		return this.jdbcTemplate.queryForObject("select count(*) from user", Integer.class);
	}
	
	public List<User> getUserList() {
		return this.jdbcTemplate.query("select * from user", new RowMapper<User>() {
			public User mapRow(ResultSet rs,int ronNum) throws SQLException {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setFirstname(rs.getString("firstname"));
				user.setLasrname(rs.getString("lastname"));
				
				return user;
			}
		});
	}
}
