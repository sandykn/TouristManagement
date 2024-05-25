package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Tourist_Contact")
public class TouristContact {
	@Id
	@Column(name = "Phone_Number")
	private String phoneNumber;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Tourist_id")
	private TouristMaster tourist;
	
	public TouristContact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TouristContact(String phoneNumber, TouristMaster tourist) {
		super();
		this.phoneNumber = phoneNumber;
		this.tourist = tourist;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public TouristMaster getTourist() {
		return tourist;
	}
	public void setTourist(TouristMaster tourist) {
		this.tourist = tourist;
	}
	@Override
	public String toString() {
		return "TouristContact [phoneNumber=" + phoneNumber + ", tourist=" + tourist + "]";
	}
	
	

}
