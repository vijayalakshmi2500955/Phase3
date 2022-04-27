package com.ecommerce.springjdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ecommerce.springjdbc.dao.EProductDAO;
import com.ecommerce.springjdbc.entity.EproductEntity;

@Controller
public class MainController {


		@Autowired
		EProductDAO dao;


		@RequestMapping(value="/springjdbc/list",method = RequestMethod.GET)
		public String   listProducts(ModelMap model) {

			System.out.println("Main Controller");

			List<EproductEntity> productList = dao.getProducts();

				model.addAttribute("productList", productList);

				return "listProducts"; // its a view/page name

		}
}