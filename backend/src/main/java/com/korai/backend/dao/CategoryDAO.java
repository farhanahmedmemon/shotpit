package com.korai.backend.dao;

import java.util.List;

import com.korai.backend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	Category get(int id);

}
