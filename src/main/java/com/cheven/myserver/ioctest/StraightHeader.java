package com.cheven.myserver.ioctest;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("header")
public class StraightHeader implements Header {
	
	@Value("${color}")
	private String color;
	@Value("${size}")
	private int size;
	
//	public StraightHeader(String color,int size) {
//		this.color = color;
//		this.size = size;
//	}

	
//	public StraightHeader (Map<String,String> paras) {
//		this.color = paras.get("color");
//		this.size = Integer.valueOf(paras.get("size"));
//	}
	@PostConstruct
	public void init() {
		System.out.println("init method!");
	}
	@PreDestroy
	public void destory() {
		System.out.println("destory method!");
	}
	@Override
	public void dowork() {
		System.out.println("do work with straightheader");
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return "StraightHeader: color=" + color + " size=" + size;
	}

}
