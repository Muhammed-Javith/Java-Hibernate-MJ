package com.app.mj;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "prodtab")
public class Product {
	@Id
	@Column(name = "pid")
	private int prodId;
	@Column(name = "pname")
	private String prodName;
	@Column(name = "pcost")
	private double prodCost;
	@OneToMany
	@JoinColumn(name = "pidFk")
	private Set<Module> mob = new HashSet<Module>();

	public Product() {
		super();
	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public double getProdCost() {
		return prodCost;
	}

	public void setProdCost(double prodCost) {
		this.prodCost = prodCost;
	}

	public Set<Module> getMob() {
		return mob;
	}

	public void setMob(Set<Module> mob) {
		this.mob = mob;
	}

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", prodCost=" + prodCost + ", mob=" + mob + "]";
	}
}