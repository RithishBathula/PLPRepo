package com.cg.spring.plpmod21.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.spring.plpmod21.beans.Product;
import com.cg.spring.plpmod21.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService service;
	
	@RequestMapping(method=RequestMethod.POST,value="/addproduct")
	public void add(Product p) {
		service.addProduct(p);
	}
}
