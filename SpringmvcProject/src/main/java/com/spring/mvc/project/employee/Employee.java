package com.spring.mvc.project.employee;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"eid","ename","ecourse"})
public class Employee {
	@Id
	@JsonProperty("id")
	int eid;
	String ename;
	String ecourse;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEcourse() {
		return ecourse;
	}
	public void setEcourse(String ecourse) {
		this.ecourse = ecourse;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", ecourse=" + ecourse + "]";
	}
	

}
