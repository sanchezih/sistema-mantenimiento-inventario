package com.companyname.springapp.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.companyname.springapp.business.entities.Product;
import com.companyname.springapp.business.services.ProductManager;
import com.companyname.springapp.business.services.SimpleProductManager;

@Configuration
@ComponentScan
public class SpringappBusinessConfig {

	private static Double CHAIR_PRICE = new Double(20.50);
	private static String CHAIR_DESCRIPTION = "Chair";

	private static String TABLE_DESCRIPTION = "Table";
	private static Double TABLE_PRICE = new Double(150.10);

	@Bean
	public ProductManager loadProductManager() {
		SimpleProductManager simpleProductManager = new SimpleProductManager();

		List<Product> products = new ArrayList<Product>();
		Product product = new Product();
		product.setDescription(CHAIR_DESCRIPTION);
		product.setPrice(CHAIR_PRICE);
		products.add(product);
		product = new Product();
		product.setDescription(TABLE_DESCRIPTION);
		product.setPrice(TABLE_PRICE);
		products.add(product);

		simpleProductManager.setProducts(products);
		return simpleProductManager;
	}
}