package com.spring.EducationalLoanPortal.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.EducationalLoanPortal.model.LoginModel;

public interface Loginrepo extends JpaRepository<LoginModel, String> {

}
