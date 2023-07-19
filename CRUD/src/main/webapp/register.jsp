<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Register</h1>
	<form action="UserController" method="get">
		<table>
			<tr>
				<td>Name : </td>
				<td><input type="text" name="name" placeholder="enter your name"></td>
			</tr>
			<tr>
				<td>Contact : </td>
				<td><input type="tel" name="contact" placeholder="enter your contact"></td>
			</tr>
			<tr>
				<td>Gender : </td>
				<td><input type="text" name="gender" placeholder="male or female or other"></td>
			</tr>
			<tr>
				<td>DOB : </td>
				<td><input type="date" name="date" placeholder="enter your dob"></td>
			</tr>
			<tr>
				<td>Address : </td>
				<td><input type="text" name="address" placeholder="enter your address"></td>
			</tr>
			<tr>
				<td>Email : </td>
				<td><input type="email" name="email" placeholder="enter your email"></td>
			</tr>
			<tr>
				<td>Password : </td>
				<td><input type="password" name="password" placeholder="enter your password"></td>
			</tr>
			<tr>
				<td><a href="UserController?action=register">Register</a></td>
			</tr>
		</table>
	</form>
</body>
</html>