package com.rocketwave.teste.cadastroclientes.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.rocketwave.teste.cadastroclientes.dto.PedidosDto;
import com.rocketwave.teste.cadastroclientes.entity.Item;
import com.rocketwave.teste.cadastroclientes.entity.Pedidos;
import com.rocketwave.teste.cadastroclientes.repository.ItemRepository;
import com.rocketwave.teste.cadastroclientes.repository.PedidosRepository;


@RestController
@RequestMapping("/api/pedidos")
public class PedidosController {

	@Autowired
	private ItemRepository itemRepository;
	
	@Autowired
	private PedidosRepository pedidosRepository;
	
	@GetMapping(value = "/listar")
	public List<Pedidos> buscarTodos() {
		List<Pedidos> buscarPedidos = pedidosRepository.findAll();
		return buscarPedidos;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Pedidos salvar(@RequestBody PedidosDto dto) {
		LocalDate data = LocalDate.parse(dto.getDataNascimento(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

		Integer idItem = dto.getIdItem();

		Item item = 
				itemRepository
				    .findById(idItem)
				    .orElseThrow(() -> 
				           new ResponseStatusException(
				        		   HttpStatus.BAD_REQUEST, "Pedido não existe"));

		Pedidos pedidos = new Pedidos();

		pedidos.setNome(dto.getNome());
		pedidos.setEmail(dto.getEmail());
		pedidos.setEndereco(dto.getEndereco());
		pedidos.setTelefone(dto.getTelefone());
		pedidos.setDataNascimento(data);
		pedidos.setEndrecoEntrega(dto.getEnderecoEntrega());
		pedidos.setValorTotal(dto.getValorTotal());
		pedidos.setItem(item);
		return pedidosRepository.save(pedidos);
		
		
	}

}
