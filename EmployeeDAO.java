package com.demo.dao;

import java.util.List;

import com.demo.bean.Employee;

public interface EmployeeDAO {
	
	int insertEmployee(Employee e);
	
	public String getEmployeeName(int id);
	
	
	public int updateEmployee(Employee emp);
	public int deleteEmployee(Employee emp); 
	
	public List<Employee> getAllEmoloyee();

}
