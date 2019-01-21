package com.cg.boot.app.service;
/**
 * {@link ProductsService} contains the contract for service implementation.
 * 
 */

import java.util.List;


import com.cg.boot.app.entity.Product;

public interface ProductsService {

	List<Product> addProducts(List<Product> products);
	List<Product> getProducts();
	Product getProductById(long id);
	void updateProductById(long id, Product product);
	void deleteProductById(long id);
	
}
