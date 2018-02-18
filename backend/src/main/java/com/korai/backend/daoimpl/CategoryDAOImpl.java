package com.korai.backend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.korai.backend.dao.CategoryDAO;
import com.korai.backend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
	public static List<Category>  categories = new ArrayList<Category>();
	
	static {
		
		Category category = new Category();
		 
		 category.setId(1);
		 category.setName("television");
		 category.setDescription("hsa as fas d asd a sd a s");
		 category.setImageUrl("test.png");
		 
		 categories.add(category);
		 
		 category.setId(2);
		 category.setName("mobile");
		 category.setDescription("hsa as fas d asd a sd a s");
		 category.setImageUrl("test2.png");
		 
		 categories.add(category);
		 
		 category.setId(3);
		 category.setName("laptop");
		 category.setDescription("hsa as fas d asd a sd a s");
		 category.setImageUrl("test3.png");
		 
		 categories.add(category);
		 
	}

	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		
		for( Category category : categories) {
			if(category.getId()==id) {
				return category;
			}
		}
		return null;
	}

}
