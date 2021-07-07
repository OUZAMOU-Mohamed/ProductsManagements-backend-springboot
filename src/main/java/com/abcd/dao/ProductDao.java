package com.abcd.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.abcd.model.Product;

public interface ProductDao {

	public List<Product> getProducts();
	public List<Product> addProduct(Product p);
	public List<Product> updateProduct(Long code, Product p);
	public List<Product> removeProduct(Long code);
	public Product findProduct(Long code);
			
}
