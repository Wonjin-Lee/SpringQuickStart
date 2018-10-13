package com.springbook.biz;

public class LgTv implements TV {

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
		System.out.println("LG TV VOLUME UP !");
	}

	@Override
	public void volumeDown() {
		System.out.println("LG TV VOLUME DOWN !");
	}

}
