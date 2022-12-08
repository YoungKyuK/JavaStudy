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

@RestController // 컨트롤러 bean으로 등록    bean( 자바객체 )
public class YoungtvController {
	
	@Autowired
	private CommentDAO cdao;
	
	
	
	// url과 메서드 매핑(연결) 사이트에서 /main을 치면 아래 연결된 메서드 ( ModelAndView main ) 가 호출된다.
	// model : 자료를 저장하는 객체 
	@RequestMapping(value = "/main")
	   public ModelAndView main(HttpServletRequest request, Model model) {
	      ModelAndView modelAndView = new ModelAndView();
	      
	      // main.jsp 가서 보여줘
	      modelAndView.setViewName("main");
	      
	      return modelAndView;
	   }
	
	@RequestMapping(value = "/container")
	   public ModelAndView container(HttpServletRequest request, Model model) {
	     
	      
	      ArrayList<CommentTO> commentLists = cdao.commentView("seq");
	      
	      // 변수명 , 값
	      model.addAttribute("commentLists",commentLists); // key, value
	     
	      
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
