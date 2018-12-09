<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Employee Details</h1>
	
	<form:form action = "saveEmployee.html" modelAttribute="employee" method = "post">
		
		First Name: <form:input path="firstName" /><br/>
		
		Last Name: <form:input path="lastName" /><br/>
		
		Employee ID: <form:input path="empId" /><br/>
		
		Email: <form:input path="email" /><br/>
		
		Designation: <form:select path="designation">
			<form:option value="Software Engineer">Software Engineer</form:option>
			<form:option value="Trainee">Trainee</form:option>
			<form:option value="Associate Software Engineer">Associate Software Engineer</form:option>
			<form:option value="Senior Software Engineer">Senior Software Engineer</form:option>
			<form:option value="Team Lead">Team Lead</form:option>		
		</form:select><br/>
		
		Skill Set: <form:checkbox path="skillSet" value = "Java"/>Java<br/>
		<form:checkbox path="skillSet" value = "Spring"/>Spring<br/>
		<form:checkbox path="skillSet" value = "Hibernate"/>Hibernate<br/>
		<form:checkbox path="skillSet" value = "Struts"/>Struts<br/>
		
		Gender: <form:radiobutton path="gender" value = "Male"/>Male<br/>
		<form:radiobutton path="gender" value = "Female"/>Female<br/>
		
		Password: <form:input path="password" type = "password"/><br/>
		
		Salary: <form:input path="salary"/><br/>
		
		<input type = "submit" />
	</form:form>
</body>
</html>