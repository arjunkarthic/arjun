package com.example.day1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="fruits")
public class Fruits {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
	@Column(name = "name")
private String name;
	@Column(name = "price")
private int price;
	@Column(name = "quantity")
private int quantity;
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
public Fruits(String name, int price, int quantity) {
	super();
	this.name = name;
	this.price = price;
	this.quantity = quantity;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public Fruits() {
	super();
	// TODO Auto-generated constructor stub
}
	
}
