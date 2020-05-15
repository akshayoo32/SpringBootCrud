<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.cjc.model.Student"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
	function deleteRecord() {
		alert("delete......")
		document.fun.action = "delete";
		document.fun.submit();
	}
	function updateRecord() {
		alert("update......")
		document.fun.action = "update";
		document.fun.submit();
	}
	function addRecord() {
		alert("add......")
		document.fun.action = "reg";
		document.fun.submit();
	}
</script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form name="fun">
		<div align="center">
			<table border="2">
				<tr>

					<th>Id</th>


					<th>Name</th>


					<th>Address</th>


					<th>User</th>

					<th>Pass</th>

				</tr>

				<%
					List<Student> lemp = (List) request.getAttribute("data");
					for (Student user : lemp) {
				%>
				<tr>
					<td><input type="radio" name="roll" value="<%=user.getRoll()%>"><%=user.getRoll()%></td>
					<td><%=user.getName()%></td>
					<td><%=user.getAddress()%></td>
					<td><%=user.getUser()%></td>
					<td><%=user.getPass()%></td>

				</tr>

				<%
					}
				%>
				<tr>
					<td><input type="button" value="Delete"
						onclick="deleteRecord()"></td>
					<td><input type="button" value="Update"
						onclick="updateRecord()"></td>
					<td><input type="button" value="Add" onclick="addRecord()"></td>
					<td><a href="login.jsp">log out</a></td>

				</tr>
			</table>
		</div>
	</form>

</body>
</html>