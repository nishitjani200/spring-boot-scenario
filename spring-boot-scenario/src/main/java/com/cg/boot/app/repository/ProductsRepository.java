package com.cg.boot.app.repository;

import java.util.List;
import java.util.stream.Collectors;

import com.cg.boot.app.entity.Product;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ProductsRepository {

	private List<Product> products;

	public List<Product> addProducts(List<Product> products) {
		this.products.addAll(products);
		return this.products;
	}

	public List<Product> getProducts() {
		return products;
	}

	public Product getProductById(Long id) {
		List<Product> productslist = products.stream().filter(product -> product.getId() == id)
				.collect(Collectors.toList());
		return productslist.get(0);
	}

	public void updateProductById(long id, Product product) {
		for (Product prod : products) {
			if (prod.getId() == id) {
				products.remove(prod);
				break;
			}
		}
		product.setId(id);
		products.add(product);

	}

	public void deleteProductById(long id) {
		for (Product prod : products) {
			if (prod.getId() == id) {
				products.remove(prod);
				break;
			}
		}
	}
}
