package com.spring.EducationalLoanPortal.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.EducationalLoanPortal.model.UserModel;

public interface UserRepo extends JpaRepository<UserModel, Integer> {

}
