package com.sql.jdbc.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test1 {

	public static void main(String[] args) {
		try {
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db","root", "rootroot");
			//fetch the data form DB
			//PreparedStatement stmt=conn.prepareStatement("select * from employee where eno=?");
			//ResultSet rs=stmt.executeQuery();
//			while(rs.next())
//				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			
//			Insert the data into table
//			PreparedStatement stmt=conn.prepareStatement("insert into employee values(?,?,?)");
//			stmt.setInt(1,107);
//			stmt.setString(2,"Dolly");
//			stmt.setString(3, "Noida");
//			int rs=stmt.executeUpdate();
			
			//update the data in table
//			PreparedStatement stmt=conn.prepareStatement("update employee set ename=? where eno=?");		
//			stmt.setString(1,"Ravi");
//			stmt.setInt(2,104);
//			int res=stmt.executeUpdate();
//			if(res>0)
//				System.out.println("Updated Successfully");
			
			//Delete the data in table
			PreparedStatement stmt=conn.prepareStatement("delete from employee where eno=? ");
			stmt.setInt(1,103);
			int res=stmt.executeUpdate();
			if(res>0)
				System.out.println("deleted Successfully");
			
			
			conn.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			//System.out.println(e.getMessage());
		}
		

	}

}
