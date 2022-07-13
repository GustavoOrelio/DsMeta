package com.gustavoorelio.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavoorelio.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
