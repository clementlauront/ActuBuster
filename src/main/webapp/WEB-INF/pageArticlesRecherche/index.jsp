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


	<section id="lesarticles">
		<h2>Les articles</h2>
		<form id="barreRercherche" action="" class="formulaire" method="POST">
			Barre de recherche : <input class="champ" type="text" name="search"
				placeholder="Search..." /> <input type="submit" class="bouton"
				value="OK" />
		</form>

		<p id="Nofound">
			<c:out value="${noFound}" />
	</p>

			<div id="articles">
	<c:forEach items="${listeArticle}" var="article">
				<div class="img_box">
					<a href="#"> <img src="article1.jpg" alt="???">
					</a>
				</div>
				<div class="texte">
					<h1>
						<c:out value="${article.titre}" />
					</h1>
					<p>
						Catégorie : <a href="#"><c:out value="${article.categorie}" /></a>
					</p>
					<p>
						Tags :
						<c:forEach items="${article.tags}" var="tag">
							<p>
								<c:out value="${tag.tags}" />
							</p>
						</c:forEach>
					</p>

					<p>
						<c:out value="${article.chapeau}" />
					</p>

					<div class="signature">
						<p>
							Par <a href="#"><c:out value="${article.auteur}" /></a> le 23
							février, 2017.
						</p>
						<p>
							<button>
								<a href="#">Ajouter</a>
							</button>
							<a href="/ActuBuster/ArticleDetail">Lire</a>
						</p>

					</div>

				</div>
			</c:forEach>
		</div></section>

	</main>

	<footer>
		<%@include file="../../jsptoinclude/Footer.jsp"%>
	</footer>

	<script>
		var recherche = "<c:out value= "${noFound}"/>";

		if (recherche == "") {
			document.getElementById('Nofound').style.display = "none";

		} else {
			document.getElementById('articles').style.display = "none";

		}
	</script>

</body>