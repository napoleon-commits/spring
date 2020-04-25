package com.commits.napoleon;

public class Player {
	int pid;
	String pname;
	String popening;
	
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Player(int pid, String pname, String popening) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.popening = popening;
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
	@Override
	public String toString() {
		return "Player [pid=" + pid + ", pname=" + pname + ", popening=" + popening + "]";
	}
}
