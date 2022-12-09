<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>Registration</h2>
	<form name="form1" method="post"
	enctype="multipart/form-data" action="insert">
	
	<table>
		<tr>
			<td>Product name</td>
			<td><input type="text" name="product_name"></td>
		</tr>
		
		<tr>
			<td>Price</td>
			<td><input type="number" name="price"></td>
		</tr>
		
		<tr>
			<td>Description</td>
			<td><textarea rows="5" cols="60" name="description"></textarea></td>
		</tr>
		
		<tr>
			<td>Image</td>
			<td><input type="file" name="img"></td>
		</tr>
		
		<tr>
			<td colspan="2" align="center">
			<input type="submit" value="Registration">
			<input type="button" value="list" onclick="location.href='list'">
			</td>
		</tr>
	
	</table>
	</form>

</body>
</html>