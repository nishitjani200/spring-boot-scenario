package com.cg.boot.app.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cg.boot.app.repository.ProductsRepository;

/**
 * {@link BootAppConfig} is a configiration class which contains all the been configurations the load up during application startup.
 * @author nisjani
 *
 */
@Configuration
public class BootAppConfig {

	/**
	 * this method creates a bean of {@link ProductsRepository}
	 * @return instance of a configured instance of {@link ProductsRepository} 
	 */
	@Bean
	public ProductsRepository productsRepository() {
		return new ProductsRepository(new ArrayList<>());
	}
}
