package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class YoungtvController {
	

	@RequestMapping(value = "/main")
	   public ModelAndView main(HttpServletRequest request, Model model) {
	      ModelAndView modelAndView = new ModelAndView();
	      modelAndView.setViewName("main");
	      
	      return modelAndView;
	   }
	
	@RequestMapping(value = "/container")
	   public ModelAndView container(HttpServletRequest request, Model model) {
	      ModelAndView modelAndView = new ModelAndView();
	      modelAndView.setViewName("container");
	      
	      return modelAndView;
	   }
	
	


	
	
	
}
