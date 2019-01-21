package com.cg.boot.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.boot.app.entity.Product;
import com.cg.boot.app.repository.ProductsRepository;
import com.cg.boot.app.service.ProductsService;
/**
 * {@link ProductsServiceImpl} implements the contract specified in {@link ProductsSerivce}.
 * Here we can find the logic to implement CRUD operation.
 * @author nisjani
 *
 */
@Service
public class ProductsServiceImpl implements ProductsService {
	
	@Autowired
	private ProductsRepository productsRepository;

	@Override
	public List<Product> addProducts(List<Product> products) {
		
		return productsRepository.addProducts(products);
	}

	@Override
	public List<Product> getProducts() {
		return getProducts();
	}

	@Override
	public Product getProductById(long id) {
		return productsRepository.getProductById(id); 
	}

	@Override
	public void updateProductById(long id, Product product) {
		productsRepository.updateProductById(id, product);
	}

	@Override
	public void deleteProductById(long id) {
		 productsRepository.deleteProductById(id);
	}

}
