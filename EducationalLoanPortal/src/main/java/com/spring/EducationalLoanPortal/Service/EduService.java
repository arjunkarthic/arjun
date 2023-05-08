package com.spring.EducationalLoanPortal.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.EducationalLoanPortal.Repo.AdminRepo;
import com.spring.EducationalLoanPortal.Repo.LoanApplicationRepo;
import com.spring.EducationalLoanPortal.Repo.Loginrepo;
import com.spring.EducationalLoanPortal.Repo.UserRepo;
import com.spring.EducationalLoanPortal.model.AdminModel;
import com.spring.EducationalLoanPortal.model.LoanApplicationModel;
import com.spring.EducationalLoanPortal.model.LoginModel;
import com.spring.EducationalLoanPortal.model.UserModel;

@Service
public class EduService {
	

	

		
		@Autowired
	    public AdminRepo arepo;
	     public LoanApplicationRepo loanrepo;
	     public Loginrepo lrepo;
	     public UserRepo urepo;
	     
	    //AdminModel
	     public AdminModel post1(AdminModel amodel)
	     {
	    	 return arepo.save(amodel);
	     }
	     
	     public List<AdminModel> get1()
	     {
	    	 return arepo.findAll();
	     }
	     
	     public AdminModel put1(AdminModel amodel1)
	     {
	    	 return arepo.saveAndFlush(amodel1);
	     }
	     
	     public void delete1(int password)
	     {
	    	 arepo.deleteById(password);
	     }
	     
	     //LoanApplicationModel
	     public LoanApplicationModel post2(LoanApplicationModel amodel2)
	     {
	    	 return loanrepo.save(amodel2);
	     }
	     
	     public List<LoanApplicationModel> get2()
	     {
	    	 return loanrepo.findAll();
	     }
	     
	     public LoanApplicationModel put2(LoanApplicationModel amodel3)
	     {
	    	 return loanrepo.saveAndFlush(amodel3);
	     }
	     
	     public void delete2(int loanid)
	     {
	    	 loanrepo.deleteById(loanid);
	     }
	     
	     //LoginModel
	     public LoginModel post3(LoginModel amodel4)
	     {
	    	 return lrepo.save(amodel4);
	     }
	     
	     public List<LoginModel> get3()
	     {
	    	 return lrepo.findAll();
	     }
	     
	     public LoginModel put3(LoginModel amodel5)
	     {
	    	 return lrepo.saveAndFlush(amodel5);
	     }
	     
	     public void delete3(String password)
	     {
	    	 lrepo.deleteById(password);
	     }
	     
	     //UserModel
	     
	     public UserModel post4(UserModel amodel6)
	     {
	    	 return urepo.save(amodel6);
	     }
	     
	     public List<UserModel> get4()
	     {
	    	 return urepo.findAll();
	     }
	     
	     public UserModel put4(UserModel amodel7)
	     {
	    	 return urepo.saveAndFlush(amodel7);
	     }
	     
	     public void delete4(int id)
	     {
	    	 urepo.deleteById(id);
	     }


}
