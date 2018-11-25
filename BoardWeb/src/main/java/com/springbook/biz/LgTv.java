package com.springbook.biz;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("tv")
public class LgTv implements TV {

	//@Autowired
	private Speaker speaker;
	
	public LgTv() {
		System.out.println("===> LgTV(1) 객체 생성");
	}

	@Override
	public void powerOn() {
		System.out.println("LG TV POWER ON !");
	}

	@Override
	public void powerOff() {
		System.out.println("LG TV POWER OFF !");
	}

	@Override
	public void volumeUp() {
		speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
		speaker.volumeDown();
	}

}
