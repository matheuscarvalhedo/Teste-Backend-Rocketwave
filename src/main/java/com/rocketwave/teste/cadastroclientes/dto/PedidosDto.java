package com.rocketwave.teste.cadastroclientes.dto;

import java.math.BigDecimal;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PedidosDto {
	
	private String nome;
	
	private String email;
	
	private String endereco;
	
	private String telefone;
	
	private String dataNascimento;
	
	private String enderecoEntrega;
	
	private BigDecimal valorTotal;
	
	private Integer idItem;
	
}
