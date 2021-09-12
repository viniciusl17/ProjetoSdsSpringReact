package com.deviniciante.appvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deviniciante.appvendas.entities.Sale;

public interface SaleRepository extends JpaRepository <Sale, Long> {

}
