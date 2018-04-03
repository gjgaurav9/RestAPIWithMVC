<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Student portal</h1>
	<h3>${myheader}</h3>

	<table>
		<tr>
			<td>Student Name: </td>
			<td>${student.name}</td>
		</tr>
		
		<tr>
			<td>Student hobby: </td>
			<td>${student.hobbies}</td>
		</tr>
		
		<tr>
			<td>Student phoneNumber: </td>
			<td>${student.phoneNumber}</td>
		</tr>
		
		
		 <tr>
			<td>Student dob: </td>
			<td>${student.dob}</td>
		</tr>
		
		
		<tr>
			<td>Student games: </td>
			<td>${student.games}</td>
		</tr> 
		
		
		<tr>
			<td>Student Address country: </td>
			<td>${student.address.country}</td>
		</tr>
		
		<tr>
			<td>Student Address city: </td>
			<td>${student.address.city}</td>
		</tr>
		
		<tr>
			<td>Student Address street: </td>
			<td>${student.address.street}</td>
		</tr>
		
		<tr>
			<td>Student Address pincode: </td>
			<td>${student.address.pincode}</td>
		</tr>
	</table>


</body>
</html>