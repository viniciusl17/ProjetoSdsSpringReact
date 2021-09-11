package com.deviniciante.appvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deviniciante.appvendas.entities.Seller;

public interface SellerRepository extends JpaRepository <Seller, Long> {

}
