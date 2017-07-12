package com.cheven.myserver.ioctest;

public class ScrewDriver {
	
	private Header header;
	public void setHeader(Header header) {
		this.header = header;
	}
	public void use() {
		System.out.println("using screwdriver!");
		System.out.println(this.header.getInfo());
	}
}
