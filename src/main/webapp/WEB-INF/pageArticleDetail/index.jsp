<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="fr">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>

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


	<section id="article">

		<article class="article">
			<h2>
				<c:out value="${sessionScope.ARTICLE.titre}" />
			</h2>
			
			<p>
				Catégorie : <a href="#"><c:out
						value="${sessionScope.ARTICLE.categorie}" /></a>
			</p>
			
			<p>Tags :
				
			<c:forEach items="${Liste1}" var="tag">
						<p>
							<c:out value="${tag.tags}" />
						</p>
					</c:forEach>
				
				</p>
			
			<div class="head_box">
				<a href="#"> <img src="article1.jpg" alt="???">
				</a>
			</div>

			<div class="head_box">
				<p>
					<c:out value="${sessionScope.ARTICLE.chapeau}" />
				</p>
			</div>

			<div class="contenu">
				<p><c:out value="${sessionScope.ARTICLE.contenu}"/></p>
			</div>
			
			<div class="signature">
				<p>
					Par <a href="#"><c:out value="${sessionScope.ARTICLE.auteur}"/></a> le 23 février, 2017.
				</p>
				<p>
					<button>
						<a href="#">Ajouter</a>
						<button>
							<a href="#">Enlever</a>
						</button>
					</button>
					<button>
						<a href="#">Supprimer</a>
					</button>
					<a href="#">Retour</a>
				</p>

			</div>
			</div>
		</article>

	</section>

	</main>

	<footer>
		<%@include file="../../jsptoinclude/Footer.jsp"%>
	</footer>


</body>