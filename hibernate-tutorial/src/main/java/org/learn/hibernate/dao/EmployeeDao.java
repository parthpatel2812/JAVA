package org.learn.hibernate.dao;

import java.util.List;

import org.learn.hibernate.domain.Employee;

public interface EmployeeDao { // DSO stands for data access object

	public void insert(Employee employee);

	public void update(Employee employee);

	public Employee findByEmployeeId(Integer id);

	public List<Employee> findAll();

	public void delet(Integer id);

}
