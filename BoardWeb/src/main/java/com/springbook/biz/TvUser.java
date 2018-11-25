package com.springbook.biz;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TvUser {

	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		
		/*
		TV tv = (TV)factory.getBean("tv");
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
		*/
	}

}
