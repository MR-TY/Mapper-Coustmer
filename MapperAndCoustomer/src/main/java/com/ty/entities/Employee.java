package com.ty.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "TABLE_EMP")
public class Employee {
	@Id
	private Integer emp_id;
	private Double emp_salary;
	private String emp_ename;
	private Integer emp_age;
	public Employee(Integer emp_id, Double emp_salary, String emp_ename, Integer emp_age) {
		super();
		this.emp_id = emp_id;
		this.emp_salary = emp_salary;
		this.emp_ename = emp_ename;
		this.emp_age = emp_age;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_salary=" + emp_salary + ", emp_ename=" + emp_ename + ", emp_age="
				+ emp_age + "]";
	}
	public Integer getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(Integer emp_id) {
		this.emp_id = emp_id;
	}
	public Double getEmp_salary() {
		return emp_salary;
	}
	public void setEmp_salary(Double emp_salary) {
		this.emp_salary = emp_salary;
	}
	public String getEmp_ename() {
		return emp_ename;
	}
	public void setEmp_ename(String emp_ename) {
		this.emp_ename = emp_ename;
	}
	public Integer getEmp_age() {
		return emp_age;
	}
	public void setEmp_age(Integer emp_age) {
		this.emp_age = emp_age;
	}
}
