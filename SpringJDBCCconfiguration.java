package com.demo.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.demo.dao.EmployeeDAO;
import com.demo.dao.EmployeeDAOImpl;

@Configuration
public class SpringJDBCCconfiguration {

	public SpringJDBCCconfiguration() {

	}

	public DataSource dataSource() {

		DriverManagerDataSource dataSource = new DriverManagerDataSource();

		dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@OMKAR:1521:XE");
		dataSource.setUsername("hr");
		dataSource.setPassword("hr");
		return dataSource;

	}

	@Bean
	public JdbcTemplate jdbcTemplate() {

		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource());
		return jdbcTemplate;

	}
	
	@Bean
	public EmployeeDAO employeeDAO() {
		EmployeeDAOImpl empDao=new EmployeeDAOImpl();
		return empDao;
	}

}
