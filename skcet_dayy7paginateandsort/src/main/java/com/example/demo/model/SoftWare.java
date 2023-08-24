package com.example.demo.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Details")
public class SoftWare {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="softwaredetail")
	private int sftid;
	private String sftname;
	private int cost;
	private String email;
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id=id;
	}
	public int getsftid() {
		return sftid;
	}
	public void setsftid(int sftid) {
		this.sftid=sftid;
	}
	public String getsftname() {
		return sftname;
	}
	public void setsftname(String sftname) {
		this.sftname=sftname;
	}
	public int getcost() {
		return cost;
	}
	public void setcost(int cost) {
		this.cost=cost;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email=email;
	}
}
