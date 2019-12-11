package br.com.greendogdelivery.domain;

import javax.persistence.*;
import javax.validation.constraints.*;

import org.hibernate.validator.constraints.Length;

@Entity
public class Item {

//	Constructor
	public Item(long id,
			@NotNull @Length(min = 2, max = 30, message = "O tamanho do nome deve ser entre {min} e {max} caracteres") String nome,
			@NotNull @Min(value = 20, message = "O valor mínimo deve ser {value} reais") Double preco) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}

//	Properties
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Length(min=2, max=30, message="O tamanho do nome deve ser entre {min} e {max} caracteres")
	private String nome;
	
	@NotNull
	@Min(value=20, message="O valor mínimo deve ser {value} reais")
	private Double preco;

//	Getters and setters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	
}
