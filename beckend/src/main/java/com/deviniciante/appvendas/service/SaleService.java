package com.deviniciante.appvendas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.deviniciante.appvendas.dto.SaleDTO;
import com.deviniciante.appvendas.dto.SaleSuccessDTO;
import com.deviniciante.appvendas.dto.SalesSumDTO;
import com.deviniciante.appvendas.entities.Sale;
import com.deviniciante.appvendas.repositories.SaleRepository;
import com.deviniciante.appvendas.repositories.SellerRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true) //Com isso ele não vai fazer lock no banco, pois é só para consulta
	public Page<SaleDTO> findAll(Pageable pageable){
		sellerRepository.findAll();
		Page<Sale> result = repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
	
	@Transactional(readOnly = true)
	public List<SalesSumDTO> amountGroupedBySeller(){
		return repository.amountGroupedBySeller();
	}
	
	@Transactional(readOnly = true)
	public List<SaleSuccessDTO> succesGroupedBySeller(){
		return repository.successGroupedBySeller();
	}

}
