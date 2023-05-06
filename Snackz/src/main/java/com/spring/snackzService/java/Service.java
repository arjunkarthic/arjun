package com.spring.snackzService.java;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.spring.AnswerRepo.java.AnswerRepo;
import com.spring.Answermodel.java.Answermodel;
import com.spring.QuestionRepo.java.QuestionRepo;
import com.spring.Questionmodel.java.Questionmodel;

@org.springframework.stereotype.Service

public class Service {

	

	public class MaxService {
		@Autowired
		private QuestionRepo aRepo;
		@Autowired
		private AnswerRepo dRepo;

	//Login
		public String Loginx(String usernamex, String passwordx) {
			Questionmodel userx = aRepo.findByusername(usernamex);
			if (userx == null) {
				return "Invalid User !";
			} else {
				if (userx.getPassword().equals(passwordx)) {
					return "Login Successful !";
				} else {
					return "Invalid Password";
				}
			}
		}
	//SignUp
		public Questionmodel SignUpx(Questionmodel userx) {
			return aRepo.save(userx);
		}
		
	//Users
		public List<Questionmodel> Users() {
			return aRepo.findAll();
		}
		
		
		
		
	//List Games
		public List<Answermodel> Games() {
			return dRepo.findAll();
		}
	//View Game
		public Optional<Answermodel> viewGame(Long id) {
			return dRepo.findById(id);
		}
	//Add Game
		public Answermodel addGame(Answermodel gamex) {
			return dRepo.save(gamex);
		}
	//Edit Game
		public Answermodel editGame(Answermodel gamex, Long id) {
			Answermodel gamez = dRepo.findById(id).orElse(null);
			if (gamez != null) {
				gamez.setSnackname(gamex.getSnackname());
				gamez.setManufacturedate(gamex.getManufacturedate());
				gamez.setExpiredate(gamex.getExpiredate());
				gamez.setCompanyname(gamex.getCompanyname());
				gamez.setSnackprice(gamex.getSnackprice());
				
				return dRepo.saveAndFlush(gamez);
			} else {
				return null;
			}
		}
	//Delete Game
		public String deleteGame(Long id) {
			dRepo.deleteById(id);
			return "deleted";
		}

		
		
	//Sort Games (Ascending)
		public List<Answermodel> sortGameA(String field) {
			return dRepo.findAll(Sort.by(field).ascending());
		}

	// Sort Games (Descending)
		public List<Answermodel> sortGameD(String field) {
			return dRepo.findAll(Sort.by(field).descending());
		}
	// Pagination for Games
		public List<Answermodel> pagingGames(int offset, int size){
			Page<Answermodel> xPage=dRepo.findAll(PageRequest.of(offset, size));
			return xPage.getContent();
		}
//		Pagination & Sorting Combined
		public List<Answermodel> pagingsortingGames(int offset,int size, String field){
			Page<Answermodel> xPage=dRepo.findAll(PageRequest.of(offset, size, Sort.by(field).ascending()));
			return xPage.getContent();
		}
	}

}
