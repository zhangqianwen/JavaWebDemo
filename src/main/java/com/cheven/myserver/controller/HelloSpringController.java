package com.cheven.myserver.controller;

import java.io.IOException;
import java.io.Writer;




import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloSpringController {
	
	
	@RequestMapping(value="/users/{userId}")
	public void spring(@PathVariable("userId") String userId, @RequestParam("msg") String msg,@RequestHeader("host") String host, Writer writer) throws IOException{
		writer.write("userId=" +userId+" ,msg="+msg+" ,host="+host);
	}
	
	@RequestMapping(value="/users/login")
	public String login(@RequestParam("name") String name,@RequestParam("password") String password,ModelMap map) throws IOException{
		map.addAttribute("name", name);
		map.addAttribute("password", "*******");
		
		return "user";
	}
	
	
}
