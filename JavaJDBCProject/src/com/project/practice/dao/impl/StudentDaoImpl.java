package com.project.practice.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jdbc.practice.Student;
import com.jdbc.practice.dao.StudentDao;

public class StudentDaoImpl implements StudentDao {
	
	@Override
	public int insert(Student student) {
		int res=0;
		try
		{
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/employee_db", "root", "rootroot");
			Statement st=conn.createStatement();
			res=st.executeUpdate("insert into student values("+student.getSid()+","+"'"+student.getSname()+"'"+","+"'"+student.getCourse()+"'"+")");
			conn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		return res;
	}

	@Override
	public int update(int sid) {
		int res=0;
		try {
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/employee_db", "root", "rootroot");
			PreparedStatement stmt=conn.prepareStatement("update student set course=? where sno=?");
			stmt.setString(1,"BCA");
			stmt.setInt(2,sid);
			res=stmt.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return res;
	}

	@Override
	public int delete(int sid) {
		int res=0;
		try {
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/employee_db", "root", "rootroot");
			PreparedStatement stmt=conn.prepareStatement("delete from student where sno=?");
			stmt.setInt(1,sid);
			res=stmt.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return res;
	}

	@Override
	public Student get(int student) {
		Student st=null;
		try {
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/employee_db", "root", "rootroot");
			PreparedStatement stmt=conn.prepareStatement("select * from student where sno=?");
			stmt.setInt(1, student);
			ResultSet rs=stmt.executeQuery();
			 st=new Student();
			while(rs.next())
			{
				st.setSid(rs.getInt(1));
				st.setSname(rs.getString(2));
				st.setCourse(rs.getString(3));
				
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return st;
		
		
		
	}

	@Override
	public List<Student> getAll() {
		
		List<Student> list=null;
		try {
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/employee_db", "root", "rootroot");
			PreparedStatement stmt=conn.prepareStatement("select * from student");
			ResultSet rs=stmt.executeQuery();
			list=new ArrayList<>();
			while(rs.next())
			{
				 Student st1=new Student();
				st1.setSid(rs.getInt(1));
				st1.setSname(rs.getString(2));
				st1.setCourse(rs.getString(3));
				list.add(st1);
				
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return list;
	}

}
