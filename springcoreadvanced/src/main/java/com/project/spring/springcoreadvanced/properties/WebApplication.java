package com.project.spring.springcoreadvanced.properties;

public class WebApplication {
	private String dbServer;

	public String getDbServer() {
		return dbServer;
	}

	public void setDbServer(String dbServer) {
		this.dbServer = dbServer;
	}

	@Override
	public String toString() {
		return "WebApplication [dbServer=" + dbServer + "]";
	}
	
}
