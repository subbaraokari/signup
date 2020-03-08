<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>Placement Management System</h1>
		<form action="saveAddress" method="post">
			<table>
				<tr>
					<td><input type="text" name="street_name" placeholder="Street Name" /></td>
				</tr>
				<tr>
					<td><input type="text" name="city" placeholder="City" /></td>
				</tr>
				<tr>
					<td><input type="text" name="state" placeholder="State" /></td>
				</tr>
				<tr>
					<td><input type="text"  name="country" placeholder="Country" /></td>
				</tr>
				<tr>
					<td><input type="submit" id="save" value="Save"></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>