package com.sql.jdbc.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Test3 {

	public static void main(String[] args) throws Exception {
		Connection conn = null;
		try {
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "rootroot");
//		PreparedStatement stmt=conn.prepareStatement("insert into student values(?,?,?)");
//		Student student=new Student();
//		student.setSid(102);
//		student.setName("Renu");
//		student.setStream("Mtech");
//		stmt.setString(2, student.getName());
//		stmt.setInt(1, student.getSid());
//		stmt.setString(3,student.getStream());
//		int res=stmt.executeUpdate();
		
		
		Statement st=conn.createStatement();
		Student student=new Student();
		student.setSid(103);
		student.setName("Neeru");
		student.setStream("Btech");
		String sql="insert into student values("+student.getSid()+","+"'"+student.getName()+"'"+","+"'"+student.getStream()+"'"+")";
		int res=st.executeUpdate(sql); 
		if(res>0)
			System.out.println("Inserted Successfully");
		
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		finally {
			conn.close();
		}
	}

}
