package com.spring.jdbc.jdbcconfig.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entites.Student;

@Component("getStudentDao")
public class StudentDaoImp implements StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate; 
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insertData(Student st) {
		
		String query = "insert into student values (?,?,?)";
		int i=	this.jdbcTemplate.update(query,st.getId(),st.getName(),st.getCity());
		return i;
	}

	@Override
	public int updateData(Student st) {
		String query = "update student set name =?,city =? where id = ?";
		int i=	this.jdbcTemplate.update(query,st.getName(),st.getCity(),st.getId());	
		return i;
	}

	@Override
	public int deleteData(Student st) {
		String query = "delete from student where id = ?";
		int i=	this.jdbcTemplate.update(query,st.getId());	
		return i;
	}

	@Override
	public Student getOneRow(Student st) {
		String query = "select * from student where id = ?";
		Student std =	this.jdbcTemplate.queryForObject(query,new RowMapper<Student>() {
			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student st1 = new Student();
				st1.setId(rs.getInt(1));
				st1.setName(rs.getString(2));
				st1.setCity(rs.getString(3));
				return st1;
			}
		}, st.getId());	
		return std;
	}

	@Override
	public List<Student> getAllData() {
		String query = "select * from student";
		List<Student> st  = this.jdbcTemplate.query(query,new RowMapper<Student>() {
			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student st1 = new Student();
				st1.setId(rs.getInt(1));
				st1.setName(rs.getString(2));
				st1.setCity(rs.getString(3));
				return st1;
			}
		});
		return st;
	}

}
