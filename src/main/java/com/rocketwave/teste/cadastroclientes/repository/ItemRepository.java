package com.rocketwave.teste.cadastroclientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rocketwave.teste.cadastroclientes.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{
	
	
}
