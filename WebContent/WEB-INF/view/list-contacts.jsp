<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Contact List</title>
</head>

<body>
	<div id="wrapper">
		<div id="header">
			<h2>Contact Management</h2>
		</div>
	</div>

	<div id="container">
		<div id="content">
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
				</tr>

				<c:forEach var="tempContact" items="${contacts}">
					<tr>
						<td>${tempContact.firstName}</td>
						<td>${tempContact.lastName}</td>
						<td>${tempContact.email}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>