package com.deviniciante.appvendas.dto;

import java.io.Serializable;

import com.deviniciante.appvendas.entities.Seller;

public class SalesSumDTO implements Serializable {	
	private static final long serialVersionUID = 1L;
	
	private String sellerName;
	private Double sum;
	
	public SalesSumDTO() {
	}

	public SalesSumDTO(Seller seller, Double sum) {
		this.sellerName = seller.getName(); //Não tem como agrupar por noma.. só pelo seller no postgres -- só funciona no H2
		this.sum = sum;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}	
}
