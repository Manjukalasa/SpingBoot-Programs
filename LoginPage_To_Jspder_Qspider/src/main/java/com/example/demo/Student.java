package com.example.demo;

public class Student {
	private String sid;
	private String sname;
	private long phno;
	private String bid;

	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getBname() {
		switch (bid.charAt(0))
		{
		case 'B': return "Basavangudi";
		case 'R': return "Rajajinagar";
		case 'H': return "Hyderbad";
		case 'P': return "Pune";
		case 'C': return "Canada"; 
		default: return "Invalid Branch";
		}
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public String getBid() {
		return bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", phno=" + phno + ", bid=" + bid + ", l1=" + "]";
	}
}