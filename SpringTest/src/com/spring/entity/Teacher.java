package com.spring.entity;

public class Teacher {

	private String tname;
	private int tage;
	
	public Teacher() {
		
	}
	public Teacher(String tname, int tage) {
		super();
		this.tname = tname;
		this.tage = tage;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public int getTage() {
		return tage;
	}
	public void setTage(int tage) {
		this.tage = tage;
	}
	@Override
	public String toString() {
		return "Teacher [tname=" + tname + ", tage=" + tage + "]";
	}
	
	
}
