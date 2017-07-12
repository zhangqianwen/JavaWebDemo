package com.cheven.myserver.ioctest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIocContainer {
	
	public static void  main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextdao.xml");
		
		ScrewDriver screwDriver = context.getBean("ScrewDriver", ScrewDriver.class);
		
		screwDriver.use(); 
		
		((ConfigurableApplicationContext)context).close();
	}
}
