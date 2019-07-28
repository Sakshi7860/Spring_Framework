package com.practice.hibernate.student;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.practice.hibernate.course.Course;

@Entity
@Table(name="student")
public class Student {
	@Id
	@Column(name="s_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	@Column(name="name")
	String sname;
	int roll_no;
	
	//JoinCoulmn is helps to tell the foreign key by adding one column in the table but it works differently acc. to the mappings.
     //For one to one mapping it added that join coulmn entry(address_id) in the table(Employee) to refer it into the other table(address)
	// For one to many mapping it will add the join column entry(student_id) which is a foreign key column entry, get added in 
	// Course table instead of Student table..So from course table it will refer to the student table primary key(id) column.
	// hence, Its working differently acc. to the mapping that we use
	@OneToMany(mappedBy="student",cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	List<Course> courses;

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", sname=" + sname + ", roll_no=" + roll_no + "]";
	}
	

//	@Override
//	public String toString() {
//		return "Student [id=" + id + ", sname=" + sname + ", roll_no=" + roll_no + ", courses=" + courses.get(0).getC_id()+ "]";
//	}
//	public void addCourse(Course course)
//	{
//		if(courses==null)
//		{
//			courses=new ArrayList<>();
//		}
//		courses.add(course);
//	}
	

}
