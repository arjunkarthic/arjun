package com.spring.AnswerRepo.java;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.Answermodel.java.Answermodel;

public interface AnswerRepo extends JpaRepository<Answermodel, Long> {
	

}
