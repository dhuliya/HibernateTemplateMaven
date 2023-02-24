package com.main.dao;

import java.util.List;

import com.main.eo.Employee;

public interface EmployeeDAO {
	List<Employee> fetchEmployees();
	Employee fetchEmployee(int id);
	int insertEmployee(Employee emp);
	void updateEmployee(Employee emp);
	void deleteEmployee(int id);
}
