<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<c:url value="resources/css/style.css" />" rel="stylesheet" />
<%-- <link href="${pageContext.request.contextPath}/resources/css/style.css" type="text/css" rel="stylesheet" /> --%>

<title>Insert title here</title>
</head>
<body>



	<table>
		<tr>
			<th>First name</th>
			<th>Last name</th>
			<th>House</th>
			<th>Status</th>
			<th>Action</th>
		</tr>
		<c:forEach var="customer" items="${customers}">
			<c:url var="deleteLink" value="deleteCustomer">
				<c:param name="id" value="${customer.id}"></c:param>
			</c:url>
			<c:url var="updateLink" value="updateCustomer">
				<c:param name="id" value="${customer.id}"></c:param>
			</c:url>
			<tr>
				<td>${customer.firstName}</td>
				<td>${customer.lastName}</td>
				<td>${customer.house}</td>
				<td>${customer.status}</td>
				<td>
					<button type="button" class="myButton"
						onclick="window.location.href='${deleteLink}'">Delete</button>
					<button type="button" class="myButton"
						onclick="window.location.href='${updateLink}'">Update</button>


				</td>
			</tr>
		</c:forEach>
	</table>
	<div id="addButtonDiv">
		<button type="button" id="addButton"
			onclick="window.location.href='addCustomer'">Add character</button>
	</div>

</body>
</html>