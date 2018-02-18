package com.korai.frontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.korai.backend.dao.CategoryDAO;
import com.korai.backend.dto.Category;

@Controller
public class PageController {
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@RequestMapping(value= {"/", "/home", "/index"})
	public ModelAndView index() {
		
		ModelAndView mv = new ModelAndView("index");
		
		mv.addObject("title","Home");
		
		mv.addObject("cat", categoryDAO.list());
		mv.addObject("userClickHome",true);
		
		return mv;	
		
	}
	
	@RequestMapping(value="/about")
	public ModelAndView about() {
	
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("title", "About");
		mv.addObject("userClickAbout", true);
		
		return mv;
	}
	
	@RequestMapping(value= "/contact")
	public ModelAndView contact() {
		
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("contact","Contact us");
		mv.addObject("userClickContact",true);
		
		return mv;
		
	}
	
	@RequestMapping(value= {"/all/products"})
	public ModelAndView allProducts() {
		
		ModelAndView mv = new ModelAndView("index");
		
		mv.addObject("title","All products");
		
		mv.addObject("cat", categoryDAO.list());
		mv.addObject("userClickAllProducts",true);
		
		return mv;	
		
	}
	
	@RequestMapping(value= {"/show/category/{id}/products"})
	public ModelAndView showCategoryProducts(@PathVariable("id") int id) {
		
		ModelAndView mv = new ModelAndView("index");
		
		Category category = null;
		category = categoryDAO.get(id);
		
		mv.addObject("title",category.getName());
		mv.addObject("cat", categoryDAO.list());
		
		mv.addObject("category", category);
		mv.addObject("userClickCategoryProducts",true);
		
		return mv;	
		
	}

}
