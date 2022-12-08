<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt"  uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn"  uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/css/main.css">
</head>
<body>

<h2>Product List</h2>
<table width="100%">
	<tr>
		<c:forEach var="row" items="${lists}" varStatus="vs">
			<td style="width:20%; word-break: break-word; vertical-align:bottom;" >
			<c:choose>
				<c:when test="{$row.filename !='-'}">
					<img src="/resources/images/${row.filename}" width="100px" height="100px"><br>
				</c:when>
				
				<c:otherwise>
					[Product image not registered] <br>
				</c:otherwise>
			</c:choose>
			
			Product name : ${row.product_name}<br>
			Price : <fmt:formatNumber values="${row.price}" pattern ="#,###" />
			</td>
			
			<c:if test="${vs.count mod 5 == 0}">
				</tr><tr>
			</c:if>
		</c:forEach>
	</tr>



</table>

</body>
</html>