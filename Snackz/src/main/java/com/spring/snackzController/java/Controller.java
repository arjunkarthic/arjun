package com.spring.snackzController.java;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.Answermodel.java.Answermodel;
import com.spring.Questionmodel.java.Questionmodel;
import com.spring.snackzService.java.Service.MaxService;

//import io.swagger.v3.oas.annotations.tags.Tag;
@RestController
@RequestMapping("/api")
public class Controller {
	




	

	



		@Autowired

		private MaxService servicex;

		

		

//		@Tag(name = "Login Method",description = "User Validation")

		@PostMapping("/auth/login")

		private String Login(@RequestBody Map<String, String> Loginx) {

		    String username = Loginx.get("username");

		    String password = Loginx.get("password");

		    String result = servicex.Loginx(username, password);

		    return result;

		}

		@GetMapping("/auth/users")

		private List<Questionmodel> Users() {

			return servicex.Users();

		}

//		@Tag(name = "Signup Method",description = "/")

		@PostMapping("/auth/signup")

		private Questionmodel SignUp(@RequestBody Questionmodel username) {

			return servicex.SignUpx(username);

		}

		

		//Data

		@GetMapping("/games")

		private List<Answermodel> Games(){

			return servicex.Games();

		}

		@GetMapping("/game/{id}")

		private Optional<Answermodel> viewGame(@PathVariable Long id) {

			return servicex.viewGame(id);

		}

		@PostMapping("/game")

		private Answermodel addGame(@RequestBody Answermodel gamex) {

			return servicex.addGame(gamex);

		}

		@PutMapping("/game/{id}")

		private Answermodel editGame(@PathVariable Long id, @RequestBody Answermodel gamex) {

			return servicex.editGame(gamex, id);

		}

		@DeleteMapping("/game/{id}")

		private String deleteGame(@PathVariable Long id) {

			return servicex.deleteGame(id);

		}

		@GetMapping("/game/x/a/{field}")

		private List<Answermodel> sortGamesA(@PathVariable("field") String field) {

			return servicex.sortGameA(field);

		}

		@GetMapping("/game/x/d/{field}")

		private List<Answermodel> sortGamesD(@PathVariable("field") String field){

			return servicex.sortGameD(field);

		}

		@GetMapping("/game/x/{offset}/{size}")

		private List<Answermodel> pageGames(@PathVariable("offset") int offset, @PathVariable("size") int size){

			return servicex.pagingGames(offset, size);

		}

		@GetMapping("/game/x/{offset}/{size}/{field}")

		private List<Answermodel> sortpageGames(@PathVariable("offset") int offset,@PathVariable("size") int size,@PathVariable("field") String field ){

			return servicex.pagingsortingGames(offset, size, field);

		}

	}




