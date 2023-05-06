package com.spring.snackz.Model;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name="snacks")

public class Store {
	@Id
	private int sno;
	private String sname;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn
	private List<SnacksItems> snacks;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public List<SnacksItems> getSnacks() {
		return snacks;
	}
	public void setSnacks(List<SnacksItems> snacks) {
		this.snacks = snacks;
	}
	

}
