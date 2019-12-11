package br.com.greendogdelivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.greendogdelivery.domain.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long>{

}
