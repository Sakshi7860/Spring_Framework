package com.sql.jdbc.practice;

public class Student {
	int sid;
	String name;
	String stream;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", stream=" + stream + "]";
	}

}
