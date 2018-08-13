package com.cg.spring.plpmod21mvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cg.spring.plpmod21mvc.beans.Product;

@RestController
public class ProductFrontController {

	@RequestMapping("/products")
	public Product addProduct(@RequestParam Product p) {
		RestTemplate rt=new RestTemplate();
		Product p1=rt.getForObject("http://localhost:9090//addproduct?p="+p, Product.class);
		return p1;
	}
}
