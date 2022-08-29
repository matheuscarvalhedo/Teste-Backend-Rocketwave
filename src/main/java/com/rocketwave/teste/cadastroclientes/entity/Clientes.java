package com.rocketwave.teste.cadastroclientes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Clientes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false, length = 150)
	@NotEmpty(message = "O campo nome não pode estar vazio")
	private String nome;
	
	@Column(nullable = false, length = 50)
	@NotEmpty(message = "O campo email não pode estar vazio")
	private String email;
	
	@Column(nullable = false, length = 150)
	@NotEmpty(message = "O campo endereço não pode estar vazio")
	private String endereco;
	
	@Column(nullable = false, length = 11)
	@NotEmpty(message = "O campo telefone não pode estar vazio")
	private String telefone;
	
	@Column(name = "data_nascimento")
	private String dataNascimento;

}
