package br.com.greendogdelivery.domain;

import javax.persistence.*;
import javax.validation.constraints.*;

import org.hibernate.validator.constraints.Length;

@Entity
public class Item {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Length(min=2, max=30, message="O tamanho do nome deve ser entre {min} e {max} caracteres")
	private String nome;
	
	@NotNull
	@Min(value=20, message="O valor mínimo deve ser {value} reais")
	private Double preco;
}
