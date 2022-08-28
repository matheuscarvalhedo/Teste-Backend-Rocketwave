package com.rocketwave.teste.cadastroclientes.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false, length = 20)
	private String sku;
	
	@Column(nullable = false, length = 150)
	private String nome;
	
	@Column
	private Integer quantidade;
	
	@Column
	private BigDecimal valorUnitario;
	
	@Column
	private BigDecimal valorTotal;
	
}
