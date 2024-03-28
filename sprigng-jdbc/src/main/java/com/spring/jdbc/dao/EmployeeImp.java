package com.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entites.Employee;

public class EmployeeImp implements EmployeeDao {

	private JdbcTemplate jdbcTemplate ;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override //insert data
	public int insertData(Employee emp) {
		
		String quary = "insert into employee values(?,?,?)";
		int i = this.jdbcTemplate.update(quary,emp.getId(),emp.getName(),emp.getCity());
		return i;
	}
	
	@Override //update Data
	public int updateData(Employee emp) {
		String quary = "update employee set name =?, city=? where id = ?";
		int i = this.jdbcTemplate.update(quary,emp.getName(),emp.getCity(),emp.getId());
		return i;
	}

	@Override //Delete Data
	public int deleteData(Employee emp) {
		String quary = "delete from employee where id = ?";
		int i = this.jdbcTemplate.update(quary,emp.getId());
		return i;
	}

	@Override // Get Data
	public Employee getOneData(Employee emp) {
		String quary = "select * from employee where id = ?";
		
//		Employee emp1 = this.jdbcTemplate.queryForObject(quary, new RowMapperImp<Employee>(), emp.getId()); //FIRST WAY
		
		
		//SECOND WAY
		Employee emp1 = this.jdbcTemplate.queryForObject(quary, new RowMapper<Employee>(){
			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee emp = new Employee();	
				
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setCity(rs.getString(3));
				return emp;
			}
		} , emp.getId());
		return emp1;
	}

	@Override
	public List<Employee> getAllData() {
		String quary = "select * from Employee";
		List<Employee> emp = this.jdbcTemplate.query(quary, new RowMapperImp());
		return emp;
	}
}
