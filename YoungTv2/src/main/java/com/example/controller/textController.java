package com.example.controller;

import javax.servlet.http.HttpServletRequest;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class textController {
	
	@RequestMapping(value = "/example")
	   public ModelAndView example(HttpServletRequest request, Model model) {
	      ModelAndView modelAndView = new ModelAndView();
	      
	      modelAndView.setViewName("example");
	      
	      return modelAndView;
	   }
	
	@RequestMapping("multi_table.do")
	public ModelAndView gugu(HttpServletRequest request, Model model) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("test/multi_table");
		return modelAndView; // views/test/multi_table.jsp
	}
	
	// @RequestParam 파라미터 디폴트로 3줌
	@RequestMapping("table_result.do")
	public String gugu_result(
			@RequestParam(defaultValue ="3") int num, Model model) {
		String result = "";
		for ( int i=1; i<=9; i++) {
			result += num + "x" + i + "=" + num*i +"<br>";
		}
		
		model.addAttribute("result", result);
		return "test/table_result";
	}
}
