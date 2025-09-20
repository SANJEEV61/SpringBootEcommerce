package com.ecommerce.project.service;

import com.ecommerce.project.model.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryServiceImpl implements CategoryService {
    private List<Category> categories = new ArrayList<>();

    @Override
    public List<Category> getAllCategories() {
        return categories;
    }

    @Override
    public void createCategory(Category category) {
        categories.add(category);
    }
}
