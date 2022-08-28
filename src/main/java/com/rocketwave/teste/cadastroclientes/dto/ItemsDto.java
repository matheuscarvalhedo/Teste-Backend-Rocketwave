package com.rocketwave.teste.cadastroclientes.dto;

import java.math.BigDecimal;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ItemsDto {
	
	private Integer id;
	
	private String sku;
	
	private String nome;
	
	private Integer quantidade;
	
	private BigDecimal valorUnitario;
	
	private BigDecimal valorTotal;
	
}
