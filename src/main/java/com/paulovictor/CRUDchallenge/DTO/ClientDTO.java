package com.paulovictor.CRUDchallenge.DTO;

import java.time.LocalDate;

import com.paulovictor.CRUDchallenge.entities.Client;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;

public class ClientDTO {

	
	private Long id;
	
	@NotBlank(message = "Campo invalido, Nome nao pode estar vazio")
	private String name;
	
	private String cpf;
	
	private Double income;
 
	@PastOrPresent(message = "Data inserida nao pode ser futura")
	private LocalDate birthDate;
	
	private Integer children;

	public ClientDTO () {}
	
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCpf() {
		return cpf;
	}

	public Double getIncome() {
		return income;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public Integer getChildren() {
		return children;
	}
	
	public ClientDTO (Client entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.cpf = entity.getCpf();
		this.income = entity.getIncome();
		this.birthDate = entity.getBirthDate();
		this.children = entity.getChildren();
	}

	
}
