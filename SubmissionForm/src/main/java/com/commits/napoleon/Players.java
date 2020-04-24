package com.commits.napoleon;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Players {
	@Id
	private int pid;
	private String pname;
	private String pemail;
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
	public String getPemail() {
		return pemail;
	}
	public void setPemail(String pemail) {
		this.pemail = pemail;
	}
	@Override
	public String toString() {
		return "Players [pid=" + pid + ", pname=" + pname + ", pemail=" + pemail + "]";
	}
	
}
