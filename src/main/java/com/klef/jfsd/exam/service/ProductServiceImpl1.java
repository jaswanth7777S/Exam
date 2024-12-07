package com.klef.jfsd.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.exam.model.Product;
import com.klef.jfsd.exam.repository.ProductRepository;

@Service
public class ProductServiceImpl1 implements ProductService1 {

	@Autowired
	private ProductRepository repository;
	@Override
	public String addproduct(Product p) {
		// TODO Auto-generated method stub
		repository.save(p);
		return "ADDED SUCCESSFULLY";
	}

}
