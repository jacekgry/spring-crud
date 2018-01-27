<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<c:url value="/resources/style.css" />" rel="stylesheet" />
<title>Add customer</title>
</head>
<body>


	<form:form method="post" modelAttribute="customer">
		<table>


			<tr>
				<td>First name:</td>
				<td><form:input path="firstName" /></td>
			</tr>
			<tr>
				<td>Last name:</td>
				<td><form:input path="lastName" /></td>
			</tr>
			<tr>
				<td>House:</td>
				<td><form:select path="house">
						<form:options items="${houses}" />
					</form:select></td>
			</tr>
			<tr>
				<td>Status:</td>
				<td>
					<form:radiobutton path="status" value="Dead" label="Dead"/> 
					<form:radiobutton path="status" value="Alive" label="Alive"/>
				</td>

			</tr>


		</table>

		<input type="submit" value="Add" />

	</form:form>








</body>
</html>