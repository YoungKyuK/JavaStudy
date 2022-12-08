package com.example.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

	@Autowired
	ProductDAO productDao;
	
	@RequestMapping("/")
	public String home() {
		return "redirect://list";
	}
	
	@RequestMapping("/list")
	public ModelAndView list (ModelAndView mav) {
		mav.setViewName("list");
		mav.addObject("list", productDao.list());
		return mav;
	}
	
}
