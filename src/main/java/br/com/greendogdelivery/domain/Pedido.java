package br.com.greendogdelivery.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.Min;

import org.hibernate.annotations.Cascade;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Pedido {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(optional=true)
	private Cliente Cliente;
	
	@ManyToMany
	@Cascade(CascadeType.MERGE)
	private List<Item> itens;
	
	@DateTimeFormat(pattern = "dd--MM-yyyy")
	private Date data;
	
	@Min(1)
	private Double valorTotal;
	
}
