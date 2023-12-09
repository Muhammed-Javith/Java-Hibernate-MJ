package com.mj;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name = "pertab")
@Inheritance(strategy = InheritanceType.JOINED)
public class Person {
	@Id
	@Column(name = "pid")
	private int perId;
	@Column(name = "pname")
	private String perName;

	public Person() {
		super();
	}

	public int getPerId() {
		return perId;
	}

	public void setPerId(int perId) {
		this.perId = perId;
	}

	public String getPerName() {
		return perName;
	}

	public void setPerName(String perName) {
		this.perName = perName;
	}

	@Override
	public String toString() {
		return "Person [perId=" + perId + ", perName=" + perName + "]";
	}
}