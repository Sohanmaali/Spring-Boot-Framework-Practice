package com.spring.jdbc.jdbcconfig.dao;

import java.util.List;

import com.spring.jdbc.entites.Student;

public interface StudentDao {

	public int insertData(Student st);
	public int updateData(Student st);
	public int deleteData(Student st);
	public Student getOneRow(Student st);
	public List<Student> getAllData();
	
}
