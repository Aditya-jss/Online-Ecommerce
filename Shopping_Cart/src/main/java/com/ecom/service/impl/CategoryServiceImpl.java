package com.ecom.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;

import com.ecom.model.Category;
import com.ecom.repository.CategoryRepository;
import com.ecom.service.CategoryService;
@Service
public class CategoryServiceImpl implements CategoryService{
private CategoryRepository categoryRepository;
	@Override
	public Category saveCategory(Category category) {
		
		return categoryRepository.save(category);
	}
	
	

	@Override
	public Boolean existCategory(String name) {
		
		return categoryRepository.existsByName(name);
	}



	@Override
	public List<Category> getAllCategory() {
		
		return categoryRepository.findAll();
	}



	@Override
	public Boolean deleteCategory(int id) {
Category category=categoryRepository.findById(id).orElse(null);
if(!ObjectUtils.isEmpty(category))
{
	categoryRepository.delete(category);
	return true;
}
return false;
	}



	@Override
	public Category  getCategoryById(int id) {
categoryRepository.findById(id).orElse(null);

		return null;
	}
	
}
