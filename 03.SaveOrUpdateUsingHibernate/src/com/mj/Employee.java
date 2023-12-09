package com.mj;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name = "employee")
public class Employee {
	@Id
	@Column(name = "empno")
	private int empId;
	@Column(name = "empname")
	private String eName;
	@Column(name = "empsal")
	private int eSal;

	public Employee() {
		super();
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return eName;
	}

	public void setEmpName(String eName) {
		this.eName = eName;
	}

	public double getEmpSal() {
		return eSal;
	}

	public void setEmpSal(int empSal) {
		this.eSal = empSal;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + eName + ", empSal=" + eSal + "]";
	}
}