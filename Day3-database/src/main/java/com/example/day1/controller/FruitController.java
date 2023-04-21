package com.example.day1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.day1.model.Fruits;
import com.example.day1.repository.FruitRepository;
@RestController
@RequestMapping("/api/fruits")
public class FruitController {
	@Autowired
	private FruitRepository fruitRepo;
	@GetMapping
	public List<Fruits> getFruits(){
		return this.fruitRepo.findAll();
	}
	@PostMapping
	public Fruits createFruit(@RequestBody Fruits data) {
	return this.fruitRepo.save(data);
	}
}
