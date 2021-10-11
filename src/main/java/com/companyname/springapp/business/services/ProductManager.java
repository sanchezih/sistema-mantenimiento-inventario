package com.companyname.springapp.business.services;

import java.util.List;

import com.companyname.springapp.business.entities.Product;

public interface ProductManager {

	public void increasePrice(int percentage);

	public List<Product> getProducts();

}