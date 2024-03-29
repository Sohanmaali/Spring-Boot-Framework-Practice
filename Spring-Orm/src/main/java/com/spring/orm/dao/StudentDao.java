package com.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entites.Student;

//import jakarta.transaction.Transactional;

public class StudentDao {

	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public StudentDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentDao(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}

	@javax.transaction.Transactional
	public int insertData(Student st) {
		return (Integer) this.hibernateTemplate.save(st);
	}

	public Student getOneData(Student st) {
		return this.hibernateTemplate.get(Student.class, st.getStudentId());
	}

	public List<Student> getAllData() {
		return this.hibernateTemplate.loadAll(Student.class);
	}

	@Transactional
	public void deleteData(Student st) {

		this.hibernateTemplate.delete(this.hibernateTemplate.get(Student.class, st.getStudentId()));
	}

	@Transactional
	public void updateData(Student st) {

		this.hibernateTemplate.update(st);
	}
}
