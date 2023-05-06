package com.spring.snackz.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.snackz.Model.SnacksItems;

public interface SnacksItemsRepo extends JpaRepository<SnacksItems, Integer> {

}




