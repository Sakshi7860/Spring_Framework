package com.project.spring.springcoreadvanced.springjdbctemplate;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
		Employee employee=new Employee();
		employee.setEno(rs.getInt(1));
		employee.setEcity(rs.getString(2));
		employee.setEname(rs.getString(3));
		return employee;
	}

}
