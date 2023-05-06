package com.spring.QuestionRepo.java;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.Questionmodel.java.Questionmodel;

public interface QuestionRepo extends JpaRepository<Questionmodel, Integer> {

	Questionmodel findByusername(String username);
}
