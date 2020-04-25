package com.commits.napoleon;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Players {
	@Id
	@GeneratedValue
	private int pid;
	private String pname;
	private String opening;
	
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
	public String getOpening() {
		return opening;
	}
	public void setOpening(String opening) {
		this.opening = opening;
	}
	
	@Override
	public String toString() {
		return "Players [pid=" + pid + ", pname=" + pname + ", opening=" + opening + "]";
	}
}
