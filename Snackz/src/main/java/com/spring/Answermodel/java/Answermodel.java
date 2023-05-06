package com.spring.Answermodel.java;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="store")
public class Answermodel {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private String snackname;
private int manufacturedate;
private int expiredate;
private String companyname;
private float snackprice;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getSnackname() {
	return snackname;
}
public void setSnackname(String snackname) {
	this.snackname = snackname;
}
public int getManufacturedate() {
	return manufacturedate;
}
public void setManufacturedate(int manufacturedate) {
	this.manufacturedate = manufacturedate;
}
public int getExpiredate() {
	return expiredate;
}
public void setExpiredate(int expiredate) {
	this.expiredate = expiredate;
}
public String getCompanyname() {
	return companyname;
}
public void setCompanyname(String companyname) {
	this.companyname = companyname;
}
public float getSnackprice() {
	return snackprice;
}
public void setSnackprice(float snackprice) {
	this.snackprice = snackprice;
}

}
