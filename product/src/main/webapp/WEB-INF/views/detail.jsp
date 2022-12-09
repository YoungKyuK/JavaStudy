<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
function product_update(){
	document.form1.action="/update";
	document.form1.submit();
}

function product_delete(){
	if( confirm("삭제하시겠습니까?")){
		document.form1.action="/delete";
		document.form1.submit();
	}
}

</script>

</head>
<body>

<h2>Edit</h2>
	<form name="form1" method="post"
	enctype="multipart/form-data">
	
	<table>
		<tr>
			<td>Product name</td>
			<td><input type="text" name="product_name" value="${product.product_name}"></td>
		</tr>
		
		<tr>
			<td>Price</td>
			<td><input type="number" name="price" value="${product.price}"></td>
		</tr>
		
		<tr>
			<td>Description</td>
			<td><textarea rows="5" cols="60" name="description">${product.description}</textarea></td>
		</tr>
		
		<tr>
			<td>Image</td>
			<td>
				<c:if test="${product.filename != '-'}">
					<img src="/resources/images/${product.filename}" width="300px" height="300px">
					<br>
				</c:if>
			<input type="file" name="img">
			</td>
		</tr>
		
		<tr>
			<td colspan="2" align="center">
			<input type="hidden" name="product_code" value="${product.product_code}">
			<input type="button" value="Update" onclick="product_update()">
			<input type="button" value= "Delete" onclick="product_delete()">
			<input type="button" value="list" onclick="location.href='/'">
			</td>
		</tr>
	
	</table>
	</form>


</body>
</html>