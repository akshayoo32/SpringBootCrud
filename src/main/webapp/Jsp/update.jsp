<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.cjc.model.Student"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		Student user = (Student) request.getAttribute("data");
	%>
	<form action="fupdate">

		<table border="2">

			<tr>

				<th>roll</th>


				<th>Name</th>


				<th>Address</th>

 
				<th>user</th>

				<th>pass</th>

			</tr>

			<tr>
				<td><input type="hidden" name="roll" value="<%=user.getRoll()%>"></td>
				<td><input type="text" name="name" value="<%=user.getName()%>"></td>
				<td><input type="text" name="address" value="<%=user.getAddress()%>"></td>
				<td><input type="text" name="user" value="<%=user.getUser()%>"></td>
				<td><input type="text" name="pass" value="<%=user.getPass()%>"></td>

			</tr>
			<tr>
				<td><input type="submit" value="update"></td>
			</tr>



		</table>

	</form>
</body>
</html>