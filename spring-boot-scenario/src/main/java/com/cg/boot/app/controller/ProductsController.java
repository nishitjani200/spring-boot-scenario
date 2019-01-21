package com.cg.boot.app.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.boot.app.entity.Product;
import com.cg.boot.app.service.ProductsService;

/**
 * {@link ProductsController} attends all the rest requests with URI
 * 
 * @author nisjani
 *
 */
@RestController
@RequestMapping("/products")
public class ProductsController {

	@Autowired
	private ProductsService productService;

	/**
	 * This method adds an array of products It returns a {@link HttpStatus} of
	 * CREATED(201) when method work without any {@link Exception}.
	 * 
	 * @param products{@link set} of {@link Product} passed into {@link RequestBody}
	 * @return response {@link ResponseEntity} containing {@link Set} of
	 *         {@link Product} and {@link HttpStatus}
	 */
	@PostMapping
	public ResponseEntity<List<Product>> addProducts(@RequestBody List<Product> products) {
		return new ResponseEntity<>(productService.addProducts(products), HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<Product>> getProduct() {
		return new ResponseEntity<>(productService.getProducts(), HttpStatus.ACCEPTED);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable long id) {
		return new ResponseEntity<>(productService.getProductById(id), HttpStatus.ACCEPTED);

	}

	@PutMapping("/{id}")
	public ResponseEntity<Void> updateProductById(@PathVariable long id, @RequestBody Product product) {
		productService.updateProductById(id, product);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteProductById(@RequestParam long id) {
		productService.deleteProductById(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}
