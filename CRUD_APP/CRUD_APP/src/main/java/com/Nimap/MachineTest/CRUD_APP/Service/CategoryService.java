package com.Nimap.MachineTest.CRUD_APP.Service;

import com.Nimap.MachineTest.CRUD_APP.Entity.Category;
import com.Nimap.MachineTest.CRUD_APP.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Page<Category> getAllCategories(int page, int size) {
        return categoryRepository.findAll(PageRequest.of(page, size));
    }

    public Optional<Category> getCategoryById(Long id) {
        return categoryRepository.findById(id);
    }

    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    public Category updateCategory(Long id, Category categoryDetails) {
        Category category = categoryRepository.findById(id).orElseThrow();
        category.setName(categoryDetails.getName());
        return categoryRepository.save(category);
    }

    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }
}

