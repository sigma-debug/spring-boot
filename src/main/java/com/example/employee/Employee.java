package com.example.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author SRIJAN SAREEN
 *
 */
@Component
public class Employee {
	private int emp_id;
	private String emp_name;
	@Autowired
	private Company company;
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public void show() {
		System.out.println("ID: "+emp_id);
		System.out.println("Name: "+emp_name);
		System.out.println("In Employee Class");
		company.companyDetails();
	}
}
