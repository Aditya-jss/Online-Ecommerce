//package com.ecom.service.impl;
//
//import java.io.File;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.nio.file.StandardCopyOption;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.stereotype.Service;
//import org.springframework.util.ObjectUtils;
//import org.springframework.web.multipart.MultipartFile;
//
//import com.ecom.model.Product;
//import com.ecom.repository.ProductRepository;
//import com.ecom.service.ProductService;
//
//@Service
//public class ProductServiceImpl implements ProductService {
//
//	@Autowired
//	private ProductRepository productRepository;
//
//	@Override
//	public Product saveProduct(Product product) {
//		return productRepository.save(product);
//	}
//@Override
//	public List<Product> getAllProducts() {
//		return productRepository.findAll();
//	}
//
//@Override
//	public Boolean deleteProduct(Integer id) {
//		Product product = productRepository.findById(id).orElse(null);
//
//		if (!ObjectUtils.isEmpty(product)) {
//			productRepository.delete(product);
//			return true;
//		}
//		return false;
//	}
//}
