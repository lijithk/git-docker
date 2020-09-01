package org.dxc.dockerjenkins.controller;

import org.dxc.dockerjenkins.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
@GetMapping("/product")
public Product getproduct() {
	Product p=new Product(101,"pen","studies");
	return p;
	
	
}
}
