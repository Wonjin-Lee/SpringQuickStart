package com.springbook.biz;

public class SamsungTv implements TV {

	private Speaker speaker;
	private int price;
	
	public SamsungTv() {
		System.out.println("===> SAMSUNG TV 객체 생성(1) !");
	}
	public SamsungTv(Speaker speaker) {
		System.out.println("===> SAMSUNG TV 객체 생성(2) !");
		this.speaker = speaker;
	}
	public SamsungTv(Speaker speaker, int price) {
		System.out.println("===> SAMSUNG TV 객체 생성(3) !");
		this.speaker = speaker;
		this.price = price;
	}
	
	public void initMethod() {
		System.out.println("SAMSUNG TV 객체 초기화 작업 처리 !");
	}
	
	public void destroyMethod() {
		System.out.println("SAMSUNG TV 객체 삭제 전에 처리되는 메소드 !");
	}
	
	@Override
	public void powerOn() {
		System.out.println("SAMSUNG TV POWER ON ! (Price : " + price + ")");
	}

	@Override
	public void powerOff() {
		System.out.println("SAMSUNG TV POWER OFF !");
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
