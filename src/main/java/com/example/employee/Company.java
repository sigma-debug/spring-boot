package com.example.employee;

import org.springframework.stereotype.Component;

@Component
public class Company {
	private String company_name;
	private String company_profile;
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getCompany_profile() {
		return company_profile;
	}
	public void setCompany_profile(String company_profile) {
		this.company_profile = company_profile;
	}
	public void companyDetails() {
		System.out.println("Company Name: "+company_name);
		System.out.print("Comapny Profile: "+company_profile);
	}
}
