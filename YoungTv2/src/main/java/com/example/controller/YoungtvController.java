package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.model1.CommentDAO;
import com.example.model1.CommentTO;

@RestController
public class YoungtvController {
	
	@Autowired
	private CommentDAO cdao;
	

	@RequestMapping(value = "/main")
	   public ModelAndView main(HttpServletRequest request, Model model) {
	      ModelAndView modelAndView = new ModelAndView();
	      modelAndView.setViewName("main");
	      
	      return modelAndView;
	   }
	
	@RequestMapping(value = "/container")
	   public ModelAndView container(HttpServletRequest request, Model model) {
	     
	      
	      ArrayList<CommentTO> commentLists = cdao.commentView("seq");
	      
	      model.addAttribute("commentLists",commentLists);
	     
	      
	      return new ModelAndView("container");
	   }
	
	
	@RequestMapping( "/container/cmt")   
    public ModelAndView cmtWriteOk(HttpSession sess,HttpServletRequest request,HttpServletResponse response,Model model) {
    CommentTO cto = new CommentTO();
    
    cto.setSeq((String)sess.getAttribute("seq"));
    cto.setPassword( request.getParameter("password") );
    cto.setContent( request.getParameter( "content" ) ); 

    int flag = cdao.commentWrite(cto);
    
    model.addAttribute("flag",flag);
    
       return new ModelAndView("container_writeok"); 
 }
	
	


	
	
	
}
