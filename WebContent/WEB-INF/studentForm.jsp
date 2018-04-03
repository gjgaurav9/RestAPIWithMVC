<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<!-- Added for form error implementation -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<!-- Added for form error implementation -->
	<form:errors path="student.*"/>
	
	<form action="success.html" method="post">
		Name: <input type="text" name="name"><br> 
		Hobbies: <input type="text" name="hobbies"><br> 
		phoneNumber: <input type="text" name="phoneNumber"><br> 
		dob: <input type="text"	name="dob"><br> 
		games: <select name="games" multiple>
			<option value="Kabbadi">Kabbadi</option>
			<option value="Khokho">Khokho</option>
			<option value="Cricket">Cricket</option>
		</select> <br> 
		
		Address: <br>
		country: <input type="text"	name="address.country"><br> 
		city: <input type="text"	name="address.city"><br> 
		street: <input type="text"	name="address.street"><br> 
		pincode: <input type="text"	name="address.pincode"><br> 
		
		
		<input type="submit" value="submit">
	</form>
</body>
</html>