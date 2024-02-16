package com.jsp.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.springmvc.dao.Productdao;

import com.jsp.springmvc.entities.product;

@Controller
public class productcontroller {
	
	
	@Autowired
	public Productdao productdao;
	

	@RequestMapping("/addproduct")
	public ModelAndView AddProduct() {
		ModelAndView mav= new ModelAndView("Addproduct");
	product p=new product();
		mav.addObject("product",p);
		return mav;
	}
	@RequestMapping("/saveProduct")
	public ModelAndView saveProduct(@ModelAttribute("product") product p) {
		ModelAndView mav= new ModelAndView("Home1");
		productdao.saveProduct(p);
		return mav;
	}
	
	@RequestMapping("/viewallproducts")
	public ModelAndView viewAllproducts() {
		ModelAndView mav = new ModelAndView("allproducts");
		List <product> products = productdao.fetchAllProducts();
		System.out.println(products);
		mav.addObject("allproducts", products);
		return mav;
		
	}

}



