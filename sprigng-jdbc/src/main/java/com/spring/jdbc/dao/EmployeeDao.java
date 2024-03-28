package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.entites.Employee;

public interface EmployeeDao {

	public int insertData(Employee emp);
	public int updateData(Employee emp);
	public int deleteData(Employee emp);
	public Employee getOneData(Employee emp);
	public List<Employee> getAllData();
}
