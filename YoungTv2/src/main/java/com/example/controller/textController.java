package com.example.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;import org.hamcrest.collection.IsMapWithSize;
import org.springframework.beans.propertyeditors.URLEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

import com.example.model.PointDTO;
import com.example.model.ProductTO;

@RestController
@Controller
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
	public ModelAndView gugu_result(
			@RequestParam(defaultValue ="3") int num, Model model) {
		
		ModelAndView modelAndView = new ModelAndView();
		String result = "";
		for ( int i=1; i<=9; i++) {
			result += num + "x" + i + "=" + num*i +"<br>";
		}
		
		model.addAttribute("result", result);
		modelAndView.setViewName("test/table_result");
		return modelAndView;
	}
	
	@RequestMapping(value = "/point.do")
	   public ModelAndView point(HttpServletRequest request, Model model) {
	      ModelAndView modelAndView = new ModelAndView();
	      modelAndView.setViewName("test/point");
	      return modelAndView;
	   }
	
	// @RequestParam 개별변수 처리
	// @ModelAttribute 객체로 넘어옴
	@RequestMapping(value = "/point_result.do")
	   public ModelAndView point_result(
			   @ModelAttribute PointDTO dto, Model model) {
		  dto.setTotal(dto.getEng()+dto.getKor() + dto.getMat() );
		  String avg = String.format("%.2f", dto.getTotal()/3.0); // %.2f 소수 둘째자리까지
		  dto.setAverage(Double.parseDouble(avg));
		  model.addAttribute("dto", dto); // dto객체로 넘김
	      ModelAndView modelAndView = new ModelAndView();
	      
	      modelAndView.setViewName("test/point_result");
	      
	      return modelAndView;
	   }
	
	@RequestMapping(value = "/move.do")
	   public ModelAndView move(HttpServletRequest request, Model model) throws Exception {
	      ModelAndView modelAndView = new ModelAndView();
	      String name=URLEncoder.encode("kim" , "utf-8"); //url 변환으로 보내야함 url은 한글을 못받음
	      
	      modelAndView.addObject(name);
	      modelAndView.setViewName("redirect:/result.do?name="+name+"&age=20");
	     
	      
	      return modelAndView;
	   }
	
	@RequestMapping(value = "/result.do")
	   public ModelAndView result( Model model,
			   @RequestParam(defaultValue="noname") String name, 
			   @RequestParam(defaultValue="10") int age) throws Exception {
	      ModelAndView modelAndView = new ModelAndView();
	      name=URLDecoder.decode(name,"utf-8");
	      model.addAttribute( "name", name);
	      model.addAttribute( "age", age);
	      modelAndView.setViewName("test/result");
	      
	      return modelAndView;
	   }
	
	//@ModelAndView
	// Model : 데이터 저장소
	// View : 출력 페이지
	// 
	@RequestMapping( "/mav.do")
	   public ModelAndView mav() {
		 ModelAndView modelAndView = new ModelAndView();
	     Map<String, Object> map = new HashMap<>();
	     map.put("dto", new ProductTO("pen",1000));
	     // new ModelAndView ("이동할 주소", key ( 변수명 ) , value )
	      return new ModelAndView("test/mav_result","map",map);
	   }
	
	
	@RequestMapping(value = "/ajax.do")
	   public ModelAndView ajax(HttpServletRequest request, Model model) {
	      ModelAndView modelAndView = new ModelAndView();
	      
	      modelAndView.setViewName("test/ajax");
	      
	      return modelAndView;
	   }
	
	// @ResponseBody 데이터 자체를 리턴 => json 형식으로 리턴
	// { "name" : "TV" , "price" : 500000 }
	@RequestMapping("background.do")
	public @ResponseBody ProductTO background() {
		ProductTO dto = new ProductTO("TV", 500000);
//		dto.setName("티비");
//		dto.setPrice(1000);
		return dto; // 데이터 자체를 리턴
	}
	
	@RequestMapping(value = "/login.do")
	   public ModelAndView login(HttpServletRequest request, Model model) {
	      ModelAndView modelAndView = new ModelAndView();
	      
	      modelAndView.setViewName("test/login");
	      
	      return modelAndView;
	   }
	
	@RequestMapping(value = "/login_result.do")
	   public ModelAndView login_result(String id, String pw, Model model) {
	      ModelAndView modelAndView = new ModelAndView();
	      
	      String result="";
	      if ( id.equals("kim")&& pw.equals("1234")) {
	    	  result= "환영합니다";
	      } else {
	    	   result="아이디나 패스워드가 맞지 않습니다";
	      }
	      model.addAttribute("result",result);
	      modelAndView.setViewName("test/login_result");
	      
	      return modelAndView;
	   }
	
	
	
}
