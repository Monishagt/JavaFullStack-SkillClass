package com.pes.Lab5;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
 
public class Employee {
@Id

	private int eid;
	private String ename;
	
	private String city;
	private long phone;
	public int getEid() {
		return eid;
	}
	public Employee(int eid, String ename, String city, long phone) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.city = city;
		this.phone = phone;
	}
	
	public Employee() {
		super();
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}


}
