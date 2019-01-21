package com.cg.boot.app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * {@link Product}
 * @author nisjani
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Product {

	private long id;
	private String name;
	private String description;
	private float costPrice;
	private float sellingPrice;
	private int quantity;
	private String[] vendors;

}
