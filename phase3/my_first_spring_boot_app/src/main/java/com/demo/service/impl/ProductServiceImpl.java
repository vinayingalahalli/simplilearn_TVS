package com.demo.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.demo.model.Product;
import com.demo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	private static Map<Integer, Product>productMap=new HashMap<>();
	private static int count;
	@Override
	public Product addProduct(Product product) {
		product.setId(++count);
		productMap.put(product.getId(), product);
		return product;
	}

	@Override
	public Product updateProduct(Product product) {
		productMap.put(product.getId(), product);
		return product;
	}

	@Override
	public Product getProductById(int id) {
		// TODO Auto-generated method stub
		return productMap.get(id);
	}

	@Override
	public void deleteProductById(int id) {
		// TODO Auto-generated method stub
		productMap.remove(id);
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return new ArrayList<>(productMap.values());
	}

	@Override
	public List<Product> getProductsByManufacturerName(String manufacturerName) {
		
		return productMap.values().stream().filter(p->p.getManufacturerName().equals(manufacturerName)).collect(Collectors.toList());
	}

}
