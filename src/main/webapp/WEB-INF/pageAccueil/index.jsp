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

	<section id="lesarticles">
		<h2>Les derniers articles</h2>
		<article class="article">
			<div class="img_box">
				<a href="#"> <img src="article1.jpg" alt="???">
				</a>
			</div>

			<div class="texte">
				<h1>
					<c:out value="${TitreArticle1.titre}" />
				</h1>
				<p>
					Catégorie : <a href="#"><c:out
							value="${TitreArticle1.categorie}" /></a>
				</p>
				<p>
					Tags :
					<c:forEach items="${Liste1}" var="tag">
						<p>
							<c:out value="${tag.tags}" />
						</p>
					</c:forEach>

				</p>
				<p>
					<c:out value="${TitreArticle1.chapeau}" />
				</p>
				<div class="signature">
					<p>
						Par <a href="#"><c:out value="${TitreArticle1.auteur}" /></a> le
						23 février, 2017.
					</p>
					<button>
						<a href="#">Ajouter</a>
					</button>
					<form method="post">
						<input type="hidden" id="id" name="id"
							value=<c:out value="${id1}"/> /> <input type="submit"
							value="Lire" id="bouton_envoi" />
					</form>

				</div>
			</div>
		</article>

		<article class="article">
			<div class="img_box">
				<a href="#"> <img src="article2.jpg" alt="???">
				</a>
			</div>

			<div class="texte">
				<h1>
					<c:out value="${TitreArticle2.titre}" />
				</h1>
				<p>
					Catégorie : <a href="#"><c:out
							value="${TitreArticle2.categorie}" /></a>
				</p>

				<p>
					Tags :
					<c:forEach items="${Liste2}" var="tag">
						<p>
							<c:out value="${tag.tags}" />
						</p>
					</c:forEach>

				</p>
				<p>
					<c:out value="${TitreArticle2.chapeau}" />
				</p>
				<div class="signature">
					<p>
						Par <a href="#"><c:out value="${TitreArticle2.auteur}" /></a> le
						23 février, 2017.
					</p>
					<button>
						<a href="#">Ajouter</a>
					</button>
					<form method="post">
						<input type="hidden" id="id" name="id"
							value=<c:out value="${id2}"/> /> <input type="submit"
							value="Lire" id="bouton_envoi" />
					</form>
				</div>
			</div>
		</article>
	</section>

	</main>

	<footer>
		<%@include file="../../jsptoinclude/Footer.jsp"%>
	</footer>


</body>