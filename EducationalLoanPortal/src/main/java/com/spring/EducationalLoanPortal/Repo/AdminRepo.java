package com.spring.EducationalLoanPortal.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.EducationalLoanPortal.model.AdminModel;

public interface AdminRepo extends JpaRepository<AdminModel, Integer> {

}
