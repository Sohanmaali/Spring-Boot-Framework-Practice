package com.spring.jdbc.prepared_statement.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entites.Student;

public class StudentImp implements StudentDao {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		System.out.println("setJdbcTemplate() method call");
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int add(Student st) {
		String query = "insert into student values(?,?,?)";
		int i = this.jdbcTemplate.update(query, st.getId(), st.getName(), st.getCity());
		return i;
	}

	@Override
	public Student getOneData() {
	    String SQL = "SELECT * FROM student WHERE id = ? ";
	    
	    List<Student> st = this.jdbcTemplate.query(SQL, new PreparedStatementSetter() {
	        @Override
	        public void setValues(PreparedStatement ps) throws SQLException {
	            ps.setInt(1, 10);
	        }
	    }, new RowMapper<Student>() {
	        @Override
	        public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
	            Student std = new Student(rs.getInt(1), rs.getString(2), rs.getString(3));
	            return std;
	        }
	    });
	    return st.get(0);
	}

}
