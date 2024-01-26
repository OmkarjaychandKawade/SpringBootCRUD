package com.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.demo.bean.Employee;

//@Component("empDao")
public class EmployeeDAOImpl implements EmployeeDAO {
	
	
	@Autowired
	JdbcTemplate jt;

	public EmployeeDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	public int insertEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
		
		String sql="Insert into emp123 values (?,?,?)";
		int i=jt.update(sql,new Object[] {emp.getId(),emp.getEname(),emp.getEsal()});
		
		return i;
	}

	@Override
	public String getEmployeeName(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
		String sql="Update emp123 set salary=? where id=?";
		int i=jt.update (sql,new Object[] {emp.getEsal(),emp.getId()});
		
		return i;
	}

	@Override
	public int deleteEmployee(Employee emp) {
		
		String sql="delete from emp123 where id=?";
		int i=jt. update(sql,new Object[] {emp.getId()});
		
		return i;
	
	}
	
	//row -----object
	//select * from row column

	@Override
	public List<Employee> getAllEmoloyee() {
		// TODO Auto-generated method stub
		
		String sql="select * from emp123";
		List<Employee> empList=jt.query
				(sql,new RowMapper<Employee>() {
					@Override
					public Employee mapRow(ResultSet arg0, int arg1)
					throws SQLException{
						
					Employee emp=new Employee();
					emp.setId(arg0.getInt(1));
					emp.setEname(arg0.getString(2));
					emp.setEsal(arg0.getInt(3));
					
					return emp;
					}
						
					});
		return empList;
	}

}
