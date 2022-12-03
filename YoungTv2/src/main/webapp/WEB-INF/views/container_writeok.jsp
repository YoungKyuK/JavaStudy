<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<%
   int flag = (int)request.getAttribute("flag");
   String seq = request.getParameter("seq");
   
   
   out.println("<script type='text/javascript'>");
   out.println("$().ready(function () {");
   if (flag==0) {
		out.println("alert('댓글등록 성공')");
	    out.println("      location.href='../../../main/container?seq="+seq+"'");
	} else {
		out.println("alert('비정상 처리')");
		out.println("history.back();");
	}
   out.println("})");
   out.println("</script>");
%>