package com.spring.EducationalLoanPortal.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.EducationalLoanPortal.model.LoanApplicationModel;

public interface LoanApplicationRepo extends JpaRepository<LoanApplicationModel, Integer> {

}
