package com.orm.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.orm.entities.Student;

@Component
public class StudentDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	/**
	 * @param hibernateTemplate
	 */
	public StudentDao(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}

	/**
	 * 
	 */
	public StudentDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional
	public int insertData(Student st) {
		return (Integer) this.hibernateTemplate.save(st);
	}
}
