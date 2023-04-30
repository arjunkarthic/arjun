package Nursery.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "nursery")
public class Nursery {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String plantnameString;
	private int quantity;
	private float price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlantnameString() {
		return plantnameString;
	}
	public void setPlantnameString(String plantnameString) {
		this.plantnameString = plantnameString;
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
		return "Nursery [id=" + id + ", plantnameString=" + plantnameString + ", quantity=" + quantity + ", price="
				+ price + "]";
	}
	
	

}
