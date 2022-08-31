package com.rocketwave.teste.cadastroclientes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.rocketwave.teste.cadastroclientes.entity.Item;
import com.rocketwave.teste.cadastroclientes.repository.ItemRepository;

@RestController
@RequestMapping("/api/items")
public class ItemController {
	
	@Autowired
	private ItemRepository itemRepository;
	
	@PostMapping("/salvar")
	@ResponseStatus(HttpStatus.CREATED)
	public Item salvar(@RequestBody Item item) {
		return itemRepository.save(item);
	}
	
}
