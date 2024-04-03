package com.spring.jdbc.named_parameter.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
//import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.spring.jdbc.named_parameter.entites.Employee;

@Component
public class EmployeeDaoImp implements EmployeeDao {
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

//	private JdbcTemplate jdbcTemplate;

	public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
		return namedParameterJdbcTemplate;
	}

	public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		System.out.println("setJdbcTemplate() method call");
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}

	public EmployeeDaoImp(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		super();
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}

	public EmployeeDaoImp() {
		super();
		// TODO Auto-generated constructor stub
	}

	// ---------------------------------------------------------------------------
	@Override
	public int insert(Employee emp) {
		String sql = "INSERT INTO employee VALUES(:id, :name, :city)";
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", emp.getId());
		map.put("name", emp.getName());
		map.put("city", emp.getCity());

		this.namedParameterJdbcTemplate.execute(sql, map, new PreparedStatementCallback<Object>() {

			@Override
			public Object doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {

				return ps.executeUpdate();
			}
		});
		return 0;
	}

}
