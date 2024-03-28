package com.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.entites.Student;

public class StudentDaoImp implements StudentDao{
	
	private JdbcTemplate template;
	
	
	public JdbcTemplate getTemplate() {
		return template;
	}


	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}


	@Override
	public int insert(Student student) {
		  String quary = "insert into student values(?,?,?)";
	        
	        int i = this.template.update(quary,student.getId(),student.getName(),student.getCity());
	        
		return i;
	}

}
