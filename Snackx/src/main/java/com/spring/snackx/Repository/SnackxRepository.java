package com.spring.snackx.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.snackx.model.Snackx;

public interface SnackxRepository extends JpaRepository<Snackx, Integer> {
	Snackx findByuname(String uname);
}
