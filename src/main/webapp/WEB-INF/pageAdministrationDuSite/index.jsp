<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>Ha ha ha</p>

	<c:forEach items="${listeAdmins}" var="admin">
	<c:out value="${admin.prenom}"/>
	</c:forEach>
	<c:forEach items="${listeMembres}" var="membre">
		<div>
			<input type="checkbox" id="membres" name="membresASupprimer" value=<c:out value="${membre.id}"/>> <label><c:out value="${membre.pseudo}"/></label>
		</div>
	</c:forEach>
	<c:forEach items="${listeArticles}" var="Articles">

	</c:forEach>
</body>
</html>