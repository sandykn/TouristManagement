package com.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Tourist_Master")
public class TouristMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "Tourist_Id")
	private int id;
	@Column(name = "Tourist_Name")
	private String name;
	@Column(name = "Address")
	private String address;
	@Column(name = "Tour_date")
	private String date;
	@Column(name="Booking_Amount")
	private float bookingAmount;
	
	@OneToMany(mappedBy = "tourist", cascade = CascadeType.ALL, orphanRemoval = true)
//	@JoinColumn(name = "tourist_id")
	private List<TouristContact> contacts = new ArrayList<>();
	
	public void addPhone(TouristContact contact){
        contacts.add(contact);
        contact.setTourist(this);
        
    }
	
	public List<TouristContact> getContacts() {
		return contacts;
	}
	public void setContacts(List<TouristContact> contacts) {
		this.contacts = contacts;
	}
	public TouristMaster() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TouristMaster(int id, String name, String address, String date, float bookingAmount) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.date = date;
		this.bookingAmount = bookingAmount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public float getBookingAmount() {
		return bookingAmount;
	}
	public void setBookingAmount(float bookingAmount) {
		this.bookingAmount = bookingAmount;
	}
	@Override
	public String toString() {
		return "TouristMaster [id=" + id + ", name=" + name + ", address=" + address + ", date=" + date
				+ ", bookingAmount=" + bookingAmount + "]";
	}
	
	
	

}
