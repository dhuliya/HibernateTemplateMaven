package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.main.dao.EmployeeDAO;
import com.main.eo.Employee;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("AppConfig.xml");
		EmployeeDAO dao = ctx.getBean("employeeDAO", EmployeeDAO.class);
		
		Employee emp = new Employee(5,"Hello");
		
		//dao.insertEmployee(emp);
		//dao.deleteEmployee(2);
		
		System.out.print(dao.fetchEmployee(3));
		//dao.fetchEmployees().forEach(System.out::println);
	}

}
