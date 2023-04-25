package com.spring.snacks.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "snacks")
public class Snacks {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String snackname;
	private int quantity;
	private float price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSnackname() {
		return snackname;
	}
	public void setSnackname(String snackname) {
		this.snackname = snackname;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Snacks [id=" + id + ", snackname=" + snackname + ", quantity=" + quantity + ", price=" + price + "]";
	}
	
	
}
