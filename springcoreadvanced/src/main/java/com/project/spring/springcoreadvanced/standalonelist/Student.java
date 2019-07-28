package com.project.spring.springcoreadvanced.standalonelist;

import java.util.Set;

//import java.util.List;

public class Student {
	String name;
	Set<String> Courses;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<String> getCourses() {
		return Courses;
	}
	public void setCourses(Set<String> courses) {
		Courses = courses;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", Courses=" + Courses + "]";
	}
	
	
}
