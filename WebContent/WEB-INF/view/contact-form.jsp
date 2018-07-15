<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Add Contact</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css" />
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/add-contact-style.css" />
</head>
<body>

	<div id="wrapper">
		<div id="header">
			<h2>Contact Management</h2>
		</div>
	</div>
	
	<div id="container">
		<h3>Add Contact</h3>
		
		<form:form action="addContact" modelAttribute="contact" method="POST">
			<table>
				<tbody>
					<tr>
						<td><label>First name:</label></td>
						<td><form:input path="firstName"/></td>
					<tr>
					
					<tr>
						<td><label>Last name:</label></td>
						<td><form:input path="lastName"/></td>
					<tr>
					
					<tr>
						<td><label>Email:</label></td>
						<td><form:input path="email"/></td>
					<tr>
					
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Add" class="add"/></td>
					<tr>
				</tbody>
			</table>
		</form:form>
		
		<div style="clear; both;">
			<p>
				<a href="${pageContext.request.contextPath}/contact/list">Back to List</a>
			</p>
		</div>
	</div>
</body>
</html>