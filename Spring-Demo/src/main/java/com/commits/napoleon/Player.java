package com.commits.napoleon;

public class Player {
	int pid;
	String pname;
	String popening;
	Elo e;
	
	public Player() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Object constructed");
	}
//	public Player(int pid, String pname, String popening) {
//		super();
//		this.pid = pid;
//		this.pname = pname;
//		this.popening = popening;
//	}
	
	// constructor injection	
	public Player(Elo e) {
		this.e = e;
	}
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPopening() {
		return popening;
	}
	public void setPopening(String popening) {
		this.popening = popening;
	}
	
	public void myInit() {
		System.out.println("Object initialized");
	}
	
	public void myDestroy() {
		System.out.println("Object destroyed");
	}
	public Elo getE() {
		return e;
	}
	
	//setter injection
	public void setE(Elo e) {
		this.e = e;
	}

	@Override
	public String toString() {
		return "Player [pid=" + pid + ", pname=" + pname + ", popening=" + popening + ", e=" + e + "]";
	}
}
