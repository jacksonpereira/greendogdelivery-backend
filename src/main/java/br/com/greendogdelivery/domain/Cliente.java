package br.com.greendogdelivery.domain;

import java.util.List;
import javax.persistence.*;

import org.hibernate.annotations.Cascade;
import org.hibernate.validator.constraints.Length;

import com.sun.istack.NotNull;

@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Length(min=2, max=30, message="O tamanho do nome deve ser entre {min} e {max} caracteres")
	private String nome;
	
	@NotNull
	@Length(min=2, max=300, message="O tamanho do endereço deve ser entre {min} e {max} caracteres")
	private String endereco;
	
	@OneToMany(mappedBy="cliente", fetch=FetchType.EAGER)
	@Cascade(CascadeType.ALL)
	private List<Pedido> pedidos;
	
}
