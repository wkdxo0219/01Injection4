package com.bean;

public class EchoBean {

	//property (변수)
	int num;
	String name;
	
	
	// property injection ( setter injection )
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		System.out.println("setNum 메소드");
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setName 메소드");
		this.name = name;
	}
	
	//constructor injection(생성자 주입)
	public EchoBean(int n, String na){
		System.out.println("EchoBeam(int n) 생성자 " + n + "\t" + na);
		num = n;
		name = na;
	}

	public EchoBean(int n){
		System.out.println("EchoBeam(int n) 생성자 " + n);
		num = n;
	}
	public EchoBean() {
		super();
		System.out.println("EchoBean 생성자");
	}
	
	public String sayEcho(String mesg){
		return "Hello" + mesg;
	}
}
