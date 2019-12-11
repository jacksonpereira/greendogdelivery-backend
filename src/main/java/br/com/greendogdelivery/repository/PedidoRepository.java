package br.com.greendogdelivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.greendogdelivery.domain.Cliente;
import br.com.greendogdelivery.domain.Pedido;

public interface PedidoRepository  extends JpaRepository<Pedido, Long>{

}
