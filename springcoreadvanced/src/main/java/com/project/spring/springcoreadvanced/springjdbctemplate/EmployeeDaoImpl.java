package com.project.spring.springcoreadvanced.springjdbctemplate;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDaoImpl implements EmployeeDao {
	JdbcTemplate jdbcTemplate;
	EmployeeRowMapper employeeRowMapper;
	

	public void setEmployeeRowMapper(EmployeeRowMapper employeeRowMapper) {
		this.employeeRowMapper = employeeRowMapper;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insert(Employee employee) {
		String sql = "insert into employee values(?,?,?)";
		int result = jdbcTemplate.update(sql, employee.getEno(), employee.getEname(), employee.getEcity());
		return result;
	}

	@Override
	public int update(int empId) {
		String sql = "update employee set ename=? where eno=? ";
		int result = jdbcTemplate.update(sql, "rani", empId);
		return result;
	}

	@Override
	public int delete(int empId) {
		String sql = "delete from employee where eno=? ";
		int result = jdbcTemplate.update(sql, empId);
		return result;
	}

	@Override
	public List<Employee> getEmployeeDetails() {
		String sql="select * from employee";
		List<Employee> emp=jdbcTemplate.query(sql, employeeRowMapper);
		return emp;
	}

	@Override
	public Employee getEmployee(int empId) {
		String sql="select * from employee where eno=?";
		Employee emp=jdbcTemplate.queryForObject(sql, employeeRowMapper, empId);
		return emp;
	}
	

}
