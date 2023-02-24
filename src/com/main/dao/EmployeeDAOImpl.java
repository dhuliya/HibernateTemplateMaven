package com.main.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.main.eo.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	private HibernateTemplate hibernateTemplate;
	
	@Override
	public List<Employee> fetchEmployees() {
		return hibernateTemplate.loadAll(Employee.class);
	}

	@Override
	public Employee fetchEmployee(int id) {
		return hibernateTemplate.get(Employee.class, id);
	}

	@Override
	@Transactional
	public int insertEmployee(Employee emp) {
		return (Integer)hibernateTemplate.save(emp);
	}

	@Override
	@Transactional
	public void updateEmployee(Employee emp) {
		hibernateTemplate.update(emp);
	}

	@Override
	@Transactional
	public void deleteEmployee(int id) {
		Employee e = hibernateTemplate.get(Employee.class, id);
		hibernateTemplate.delete(e);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
