package com.cheven.myserver.jdbctest;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testDao {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContextJdbc.xml");
		MybatisUserDao dao = applicationContext.getBean("mybatisUserDao", MybatisUserDao.class);
		
		//dao.createTable();
		//dao.insertData();
		//System.out.println("size: "+dao.count());
//		dao.resetMoney();
//		
//		try {
//			dao.transferMoney("Li", "Han", 520);
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println(e.getStackTrace());
//		}
//		
//		
//		
//		List<Account> accountList = dao.getAccountList();
//		for (Account account : accountList) {
//			System.out.println(account.getUser()+" "+account.getBalance());
//		}
	
		List<User> userList = dao.getUserList();
		for (User user : userList) {
			System.out.println(""+user.getId()+" "+user.getFirstname()+" "+user.getLastname());
		}
		
		System.out.println("======================================");
		User liLei = dao.getUser("Lei");
		System.out.println(""+liLei.getId()+" "+liLei.getFirstname()+" "+liLei.getLastname());
		((ConfigurableApplicationContext)applicationContext).close();
	
	}
}
