package com.abcd.daoImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.abcd.dao.ProductDao;
import com.abcd.model.Product;

@Component
public class ProductDaoImpl implements ProductDao{

	private Map<Long, Product> prds = new HashMap<Long, Product>();
	public ProductDaoImpl() {
		prds.put(1L, new Product(1L, 100, "USB 16 GO"));
		prds.put(2L, new Product(2L, 250, "Souris logitech 2"));
		prds.put(3L, new Product(3L, 8000, "HP ENVY 15"));
		prds.put(4L, new Product(4L, 10000, "MAC BOOK PRO 15 2016"));

	}

	@Override
	public List<Product> getProducts() {
		List<Product> listPrd = new ArrayList<Product>(prds.values());
		return listPrd;
	}

	@Override
	public List<Product> addProduct(Product p) {
		prds.put(p.getCode(), p);
		List<Product> listPrd = new ArrayList<Product>(prds.values());
		return listPrd;
	}

	@Override
	public List<Product> updateProduct(Long code, Product p) {
		prds.put(code, p);
		List<Product> listPrd = new ArrayList<Product>(prds.values());
		return listPrd;
		}

	@Override
	public List<Product> removeProduct(Long code) {
		prds.remove(code);
		List<Product> listPrd = new ArrayList<Product>(prds.values());
		return listPrd;
		}

	@Override
	public Product findProduct(Long code) {
		return prds.get(code);
	}

}
