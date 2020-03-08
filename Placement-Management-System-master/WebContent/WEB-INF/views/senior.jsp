<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Placement Management System</title>
</head>
<body>
	<center>
		<h1>Placement Management System</h1>
		<form action="saveSenior" method="post">
			<table>
				<tr>
					<td><h2>Hi Senior!</h2></td>
				</tr>
				<tr>
					<td><input type="text" name="designation" placeholder="Designation" /></td>
				</tr>
				<tr>
					<td><input type="text" name="yearOfPassing"	placeholder="Year Of Passing" /></td>
				</tr>
				<tr>
					<td><input type="text" name="Department" placeholder="department" /></td>
				</tr>
				<tr>
					<td><input type="text" name="cname" placeholder="companyName" /></td>
				</tr>
				<tr>
					<td><input type="text" name="createdBy" placeholder="Created By" /></td>
				</tr>
				<tr>
					<td><textarea name="description" placeholder="Description" ></textarea></td>
				</tr>
				<tr>
					<td><input type="submit" id="save" value="Save"/></td>
				</tr>
			</table>
		</form>

	</center>
</body>
</html>