package com.app.mj;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "empbkp")
public class EmpBackup {
	@Id
	@Column(name = "eidbkp")
	private int empIdBkp;
	@Column(name = "enamebkp")
	private String empNameBkp;
	@Column(name = "esalbkp")
	private double empSalBkp;

	public EmpBackup() {
		super();
	}

	public int getEmpIdBkp() {
		return empIdBkp;
	}

	public void setEmpIdBkp(int empIdBkp) {
		this.empIdBkp = empIdBkp;
	}

	public String getEmpNameBkp() {
		return empNameBkp;
	}

	public void setEmpNameBkp(String empNameBkp) {
		this.empNameBkp = empNameBkp;
	}

	public double getEmpSalBkp() {
		return empSalBkp;
	}

	public void setEmpSalBkp(double empSalBkp) {
		this.empSalBkp = empSalBkp;
	}

	@Override
	public String toString() {
		return "EmpBackup [empIdBkp=" + empIdBkp + ", empNameBkp=" + empNameBkp + ", empSalBkp=" + empSalBkp + "]";
	}
}
