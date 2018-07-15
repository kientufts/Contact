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
				</tbody>
			</table>
		</form:form>
	</div>
</body>
</html>