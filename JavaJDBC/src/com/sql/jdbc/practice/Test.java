package com.sql.jdbc.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.JdbcConnection;

public class Test {

	public static void main(String[] args){
		try {
		//Class.forName("com.mysql.cj.jdbc.Driver");
		//Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db","root", "rootroot");
		JdbcConnection conn=(JdbcConnection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db","root", "rootroot");
		//Using Statement Interface
		Statement stmt=conn.createStatement();
		String sql="insert into employee values (104,'Rani','Delhi')";
		//String sql="select * from employee";
	//	ResultSet rs=stmt.executeQuery(sql);
		//String sql="delete from employee where eno=104";
		int res=stmt.executeUpdate(sql);
		System.out.println(res);
//		while(rs.next())
// 		{
// 			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString("ecity"));
// 		}
		if(res==1)
			System.out.println("Inserted Successfully");
		else if(res>0)
			System.out.println("updated suceessfully");
		conn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
