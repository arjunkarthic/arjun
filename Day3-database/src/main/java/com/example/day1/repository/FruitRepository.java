package com.example.day1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day1.model.Fruits;
@Repository
public interface FruitRepository extends JpaRepository<Fruits, Integer> {

}
