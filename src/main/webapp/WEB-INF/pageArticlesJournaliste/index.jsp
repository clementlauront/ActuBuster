<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<html lang="fr">

<head>
<%@include file="../../jsptoinclude/Head.jsp"%>
</head>

<body>
	<header>
		<%@include file="../../jsptoinclude/Header.jsp"%>
	</header>

	<main>
	<aside>
		<nav>
			<%@include file="../../jsptoinclude/Menu.jsp"%>
		</nav>
	</aside>

	<form method="get" action="/ActuBuster/ModifierArticle">
		<captation>Vos articles</captation>
		<table>
			<thead>
				<th>Titre</th>
				<th>Categorie</th>
				<th>Date</th>
				<th>Sélectionner l'article à modifier</th>
			</thead>
			<tbody>
				<c:forEach items="${listeArticlesLoggeur}" var="article">
					<tr>
						<td><c:out value="${article.titre}" /></td>
						<td><c:out value="${article.categorie}" /></td>
						<td><c:out value="${article.date}" /></td>
						<td><input type="radio" value=<c:out value="${article.id}"/>
							id="articles" name="idArticleAModifier"></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<input type="submit" value="Modifier l'article sélectionné">
	</form>

	</main>

	<footer>
		<%@include file="../../jsptoinclude/Footer.jsp"%>
	</footer>


</body>