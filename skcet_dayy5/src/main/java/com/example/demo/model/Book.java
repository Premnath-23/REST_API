package com.example.demo.model;

public class Book {
	    private int id;
	    private String bookName;
	    private float price;
	    private int quantity;
	    private String authorName;
	    public Book() {
	    }
	    public Book(int id, String bookName, float price, int quantity, String authorName) {
	        this.id = id;
	        this.bookName = bookName;
	        this.price = price;
	        this.quantity = quantity;
	        this.authorName = authorName;
	    }
	    // Getter and setter methods
	    public int getId() {
	        return id;
	    }
	    public void setId(int id) {
	        this.id = id;
	    }
	    public String getBookName() {
	        return bookName;
	    }
	    public void setBookName(String bookName) {
	        this.bookName = bookName;
	    }
	    public float getPrice() {
	        return price;
	    }
	    public void setPrice(float price) {
	        this.price = price;
	    }
	    public int getQuantity() {
	        return quantity;
	    }
	    public void setQuantity(int quantity) {
	        this.quantity = quantity;
	    }
	    public String getAuthorName() {
	        return authorName;
	    }
	    public void setAuthorName(String authorName) {
	        this.authorName = authorName;
	    }
}
