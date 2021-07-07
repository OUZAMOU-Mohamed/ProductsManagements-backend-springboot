package com.abcd.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abcd.dao.ProductDao;
import com.abcd.model.Product;

@RestController
public class ProductController {

	@Autowired
	private ProductDao productDao;
	
	/**
	 * @return
	 * @see dao.ProductDao#getProducts()
	 */
	@GetMapping("/products")
	public List<Product> getProducts() {
		return productDao.getProducts();
	}

	/**
	 * @param p
	 * @return
	 * @see dao.ProductDao#addProduct(model.Product)
	 */
	@PostMapping("/addProduct")
	public List<Product> addProduct(@RequestBody Product p) {
		return productDao.addProduct(p);
	}

	/**
	 * @param code
	 * @param p
	 * @return
	 * @see dao.ProductDao#updateProduct(java.lang.Long, model.Product)
	 */
	@PutMapping("/updateProduct/{code}")
	public List<Product> updateProduct(@PathVariable Long code,@RequestBody Product p) {
		return productDao.updateProduct(code, p);
	}

	/**
	 * @param code
	 * @return
	 * @see dao.ProductDao#removeProduct(java.lang.Long)
	 */
	@DeleteMapping("/removeProduct/{code}")
	public List<Product> removeProduct(@PathVariable Long code) {
		return productDao.removeProduct(code);
	}

	/**
	 * @param code
	 * @return
	 * @see dao.ProductDao#findProduct(java.lang.Long)
	 */
	@GetMapping("/products/{code}")
	public Product findProduct(@PathVariable Long code) {
		return productDao.findProduct(code);
	}

	public ProductController() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
