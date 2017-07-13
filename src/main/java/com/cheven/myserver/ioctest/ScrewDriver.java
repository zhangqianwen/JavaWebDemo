package com.cheven.myserver.ioctest;

import org.springframework.beans.factory.annotation.Autowired;

public class ScrewDriver {
	
	@Autowired
	private Header header;
	public void setHeader(Header header) {
		this.header = header;
	}
	public void use() {
		System.out.println("using screwdriver!");
		System.out.println(this.header.getInfo());
	}
}
