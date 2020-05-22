package com.spring.entity;

import org.springframework.stereotype.Controller;

@Controller("course")
public class Course {

	private String courname;
	private int coursehour;
	private Teacher teacher;
	
	public Course() {
		
	}
	
	
	
	public Course(String courname, int coursehour, Teacher teacher) {
		super();
		this.courname = courname;
		this.coursehour = coursehour;
		this.teacher = teacher;
	}



	public String getCourname() {
		return courname;
	}
	public void setCourname(String courname) {
		this.courname = courname;
	}
	public int getCoursehour() {
		return coursehour;
	}
	public void setCoursehour(int coursehour) {
		this.coursehour = coursehour;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}



	@Override
	public String toString() {
		return "Course [courname=" + courname + ", coursehour=" + coursehour + ", teacher=" + teacher.getTname() + "]";
	}
	
	
}
