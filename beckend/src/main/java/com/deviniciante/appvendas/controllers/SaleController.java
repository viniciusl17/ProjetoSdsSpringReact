package com.deviniciante.appvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deviniciante.appvendas.dto.SaleDTO;
import com.deviniciante.appvendas.dto.SaleSuccessDTO;
import com.deviniciante.appvendas.dto.SalesSumDTO;
import com.deviniciante.appvendas.service.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
	
	@Autowired
	private SaleService service;
	
	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable){
		Page<SaleDTO> list = service.findAll(pageable);
		return ResponseEntity.ok(list);	
	}
	
	@GetMapping(value = "/amount-by-seller")
	public ResponseEntity<List<SalesSumDTO>> amountGroupedBySeller(){
		List<SalesSumDTO> list = service.amountGroupedBySeller();
		return ResponseEntity.ok(list);	
	}
	
	@GetMapping(value = "/success-by-seller")
	public ResponseEntity<List<SaleSuccessDTO>> successGroupedBySeller(){
		List<SaleSuccessDTO> list = service.succesGroupedBySeller();
		return ResponseEntity.ok(list);	
	}
	
	
}
