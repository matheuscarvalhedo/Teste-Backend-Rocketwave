package com.rocketwave.teste.cadastroclientes.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;
import javax.validation.constraints.Positive;

import lombok.Data;

@Entity
@Data
public class Pedidos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false, length = 150)
	private String nome;
	
	@Column(nullable = false, length = 50)
	private String email;
	
	@Column(nullable = false, length = 150)
	private String endereco;
	
	@Column(nullable = false, length = 11)
	private String telefone;
	
	@Column(name = "data_nascimento")
	private LocalDate dataNascimento;
	
	@Column(name = "endereco_entrega", nullable = false, length = 150)
	private String enderecoEntrega;
	
	@Positive
	@Column
	private BigDecimal valorTotal;
	
	@ManyToOne
	@JoinColumn(name = "id_item")
	private Item item;
	
}
