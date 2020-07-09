package com.cts.product.dao;

import java.io.Serializable;
import java.util.List;

import com.cts.product.model.Product;

public interface ProductDao {

	void save(Product product);

	List<Product> saveAll(List<Product> products);

	List<Product> findAll();

	Product findById(int id);

	void deleteById(int id);

}