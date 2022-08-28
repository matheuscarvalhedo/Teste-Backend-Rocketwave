package com.rocketwave.teste.cadastroclientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rocketwave.teste.cadastroclientes.entity.Clientes;

public interface ClienteRepository extends JpaRepository<Clientes, Integer>{
	
	

}
