package com.demo.Test;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.bean.Employee;
import com.demo.config.SpringJDBCCconfiguration;
import com.demo.dao.EmployeeDAO;
import com.demo.dao.EmployeeDAOImpl;

public class TestMain {

	public TestMain() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringJDBCCconfiguration.class);
		System.out.println("context loaded");
		
		EmployeeDAO empDao = ctx.getBean(EmployeeDAOImpl.class);
		
		
		boolean option=true;
		while (option) {
			Scanner sc=new Scanner (System.in);
			System.out.println("Choose the correct option");
			System.out.println("1.Insert");
			System.out.println("2.Update");
			System.out.println("3.delete");
			System.out.println("4.All Employee");
			System.out.println("5.Exit");
			int choice=sc.nextInt();
			switch (choice) {
			
			case 1:
				System.out.println("Enter employee id");
				int id=sc.nextInt();
				
				System.out.println("Enter employee name");
				String name =sc.next();

				System.out.println("Enter employee salary");
				int salary=sc.nextInt();
				
				Employee e=new Employee(id,salary,name);
				
				int rows=empDao.insertEmployee(e);//
				
				System.out.println(rows + "inserted");
				
				break;
				
			case 2:
				
				System.out.println("Enter employee id");
				int id1=sc.nextInt();
				
				
				System.out.println("Enter employee salary");
				int salary1=sc.nextInt();
				
				
				Employee eudate=new Employee();
				
				eudate.setId(id1);
				
				eudate.setId(id1);
				eudate.setEsal(salary1);
				
				int rows1=empDao.updateEmployee(eudate);
				
				System.out.println(rows1 + "Updated");
				
				break;
				
				
			case 3:
				
				System.out.println("Enter employee id");
				int id2=sc.nextInt();
				
				Employee edelete=new Employee();
				edelete.setId(id2);
				
              int rows2=empDao.deleteEmployee(edelete);
				
				System.out.println(rows2 + "delete");
				
				break;
				

			case 4:
				System.out.println("All employee");
				
                    Employee empAll=new Employee();
                    List<Employee> list=empDao.getAllEmoloyee();
                    for(Employee e1:list) {
                    	System.out.println(e1);
                    }
                    break;
                    
                    
			                case 5:
			                option=false;
			                
			           
			                break;
			}

		}
		}
			
		}
		



