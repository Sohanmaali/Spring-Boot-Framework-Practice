package com.spring.jdbc.prepared_statement.dao;

import java.util.List;

import com.spring.jdbc.entites.Student;

public interface StudentDao {
	public int add(Student st);
	public Student getOneData();
}
