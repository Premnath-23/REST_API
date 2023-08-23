package com.example.demo.model;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
@Entity
@Table(name="gardenstore")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="bioname")
    private String name;
    public int getid() {
    	return id;
    }
    public void setid(int id) {
    	this.id=id;
    }
}
