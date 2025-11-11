package com.aurora.sb_ecom.service;

import com.aurora.sb_ecom.model.Category;
import com.aurora.sb_ecom.payload.CategoryDTO;
import com.aurora.sb_ecom.payload.CategoryResponseDTO;


public interface CategoryService {

    CategoryResponseDTO getCategories(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);

    CategoryDTO addCategory(CategoryDTO categoryDTO);

    CategoryDTO deleteCategory(Long categoryId);

    CategoryDTO updateCategory(CategoryDTO categoryDTO, Long categoryId);
}
