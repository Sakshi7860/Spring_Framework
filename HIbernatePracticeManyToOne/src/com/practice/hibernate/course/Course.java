package com.practice.hibernate.course;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.practice.hibernate.student.Student;

@Entity
@Table(name="course")
public class Course {
	@Id
	@Column(name = "course_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int c_id;
	@Column(name = "course_name")
	String cname;
	@ManyToOne(cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="student_id")
	Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "Course [c_id=" + c_id + ", cname=" + cname + ", student=" + student + "]";
	}
	

}
