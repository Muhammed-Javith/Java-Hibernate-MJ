package com.app.mj;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "managertab")
public class Manager {
	@Id
	@Column(name = "mid")
	private int mngId;
	@Column(name = "mname")
	private String mngName;
	@Column(name = "mfee")
	private double mngFee;

	public Manager() {
		super();
	}

	public int getMngId() {
		return mngId;
	}

	public void setMngId(int mngId) {
		this.mngId = mngId;
	}

	public String getMngName() {
		return mngName;
	}

	public void setMngName(String mngName) {
		this.mngName = mngName;
	}

	public double getMngFee() {
		return mngFee;
	}

	public void setMngFee(double mngFee) {
		this.mngFee = mngFee;
	}

	@Override
	public String toString() {
		return "Manager [mngId=" + mngId + ", mngName=" + mngName + ", mngFee=" + mngFee + "]";
	}
}