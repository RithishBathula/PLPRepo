package com.cg.spring.plpmod21.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spring.plpmod21.beans.Product;
import com.cg.spring.plpmod21.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepo repo;

	@Override
	public void addProduct(Product p) {
		repo.save(p);
		
	}

	@Override
	public void deleteProduct(int p_id) {
		repo.deleteById(p_id);
		
	}
	
}
