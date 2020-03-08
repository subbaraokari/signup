<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.error {
	color: red;
}
</style>
</head>
<body>
	<center>
		<h1>Placement Management System</h1>
		<form action="saveUser" method="post">
			<table>
				<tr>
					<td><h2>Signup</h2></td>
				</tr>
				<tr>
					<td><input type="text" name="firstName" placeholder="First Name" /></td>
				</tr>
				<tr>
					<td><input type="text" name="lastName" placeholder="LastName" /></td>
				</tr>
				<tr>
					<td><input type="password" placeholder="Password" name="password" /></td>
				</tr>
				<tr>
					<td><input  type="password" placeholder="Confirm Password" name="password"/></td>
				</tr>
				<tr>
					<td><input type="email" placeholder="Email" name="email"/></td>
				</tr>
				<tr>
					<td><input type="text" placeholder="Mobile Number" name="mobile" /></td>
				</tr>
				<tr>
					<td><input type="text" name="dob" placeholder="dd/MM/yyyy" /></td>
				</tr>
				<tr>
					<td><select name="role">
							<option value="select">Select</option>
							<option value="Placement Officer">Placement Officer</option>
							<option value="Senior">Senior</option>
							<option value="Junior">Junior</option>
						</select></td>
				</tr>
				<tr>
					<td><input type="radio" name="gender" value="Male" />Male</td>
					<td><input type="radio" name="gender" value="Female" />Female</td>
				</tr>
				<tr>
					<td><input type="submit" id="submit" value="Submit"></td>
				</tr>
				<tr>
					<td><a href='#(Login)' id='login' value='Already a member?Login' />Already a member?Login</td>
				</tr>
			</table>
		</form>
	</center>

</body>
</html>