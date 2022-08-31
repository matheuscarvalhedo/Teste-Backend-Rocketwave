package com.rocketwave.teste.cadastroclientes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.rocketwave.teste.cadastroclientes.entity.Clientes;
import com.rocketwave.teste.cadastroclientes.repository.ClienteRepository;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

	@Autowired
	private ClienteRepository repository;

	@GetMapping(value = "/listar")
	public List<Clientes> buscarTodos() {
		List<Clientes> buscarClientes = repository.findAll();
		return buscarClientes;
	}

	@PostMapping("/salvar")
	@ResponseStatus(HttpStatus.CREATED)
	public Clientes salvar(@RequestBody Clientes clientes) {
		return repository.save(clientes);
	}
	
	@PutMapping("/atualizar/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void atualizar(@PathVariable Integer id, @RequestBody Clientes clientesAtualizado) {
		repository
		.findById(id)
		.map( clientes -> {
			clientesAtualizado.setId(clientes.getId());
			return repository.save(clientesAtualizado);
		})
		.orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
}
	
	
	@DeleteMapping("/deletar/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deletar(@PathVariable Integer id) {
		repository
		.findById(id)
		.map( clientes -> {
			repository.delete(clientes);
			return Void.TYPE;
		})
		.orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
	}
	
	
}
