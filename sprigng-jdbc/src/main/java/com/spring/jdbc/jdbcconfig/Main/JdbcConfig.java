package com.spring.jdbc.jdbcconfig.Main;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

//import com.spring.jdbc.jdbcconfig.dao.StudentDao;
//import com.spring.jdbc.jdbcconfig.dao.StudentDaoImp;

@Configuration
@ComponentScan(basePackages = "com.spring.jdbc.jdbcconfig.dao")
public class JdbcConfig {

	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource ds  = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}
	
	@Bean
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
	
//	@Bean
//	public StudentDao getStudentDao() {
// // remove @ComponentScan and @Component from StudentDaoImp 
//		StudentDaoImp studentDao = new StudentDaoImp();
//		studentDao.setJdbcTemplate(getJdbcTemplate());
//			return studentDao;
//	}
}
