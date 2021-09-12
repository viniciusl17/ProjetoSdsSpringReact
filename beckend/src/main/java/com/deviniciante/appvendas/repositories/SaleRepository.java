package com.deviniciante.appvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.deviniciante.appvendas.dto.SaleSuccessDTO;
import com.deviniciante.appvendas.dto.SalesSumDTO;
import com.deviniciante.appvendas.entities.Sale;

public interface SaleRepository extends JpaRepository <Sale, Long> {

	@Query("SELECT new com.deviniciante.appvendas.dto.SalesSumDTO(obj.seller, SUM(obj.amount)) "
			+ " FROM Sale AS obj GROUP BY obj.seller ")
	List<SalesSumDTO> amountGroupedBySeller();
	
	@Query("SELECT new com.deviniciante.appvendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
			+ " FROM Sale AS obj GROUP BY obj.seller ")
	List<SaleSuccessDTO> successGroupedBySeller();
	
}
