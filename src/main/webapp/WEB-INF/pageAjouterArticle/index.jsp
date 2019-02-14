<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
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


	<section class="connexion">
		<h2>Rédiger un article</h2>
		<form method="post" action="/ActuBuster/AjouterArticle">
			<div class="container-redaction">
				<fieldset>

					<p>
						<label for="titre">Titre :</label> <input type="text" id="titre"
							name="titre" placeholder="Titre" required="required" />
					</p>

					<p>
						<label for="categorie">Catégorie :</label> <SELECT
							name="categorie" size="1">
							<OPTION selected>Choisir une catégorie
							<OPTION value="GENERALE"> GENERALE
							<OPTION value="CULTURE"> CULTURE
							<OPTION value="SCIENCE"> SCIENCE
							<OPTION value="TECHNOLOGIE"> TECHNOLOGIE
							<OPTION value="SANTE"> SANTE
							<OPTION value="SOCIETE"> SOCIETE
							<OPTION value="POLITIQUE"> POLITIQUE
							<OPTION value="HISTOIRE"> HISTOIRE
							<OPTION value="FINANCE"> FINANCE
							<OPTION value="JEUXVIDEO"> JEUXVIDEO
							<OPTION value="ECOLOGIE"> ECOLOGIE
						</SELECT>
					</p>

					<p id="tags">
						<label> Tags :</label>
						<input type="text" name="tag1">
						<input type="text" name="tag2">	
						<input type="text" name="tag3">	
					</p>

					<p>
						<label for="image">Image :</label> <input type="file" id="avatar"
							name="avatar" accept="image/png, image/jpeg, image/gif">
					</p>
				</fieldset>

				<fieldset>
					<p>
						<label for="chapeau">Chapeau de l'article :</label>
						<textarea id="chapeau" name="chapeau" rows="3"></textarea>
					</p>
					<p>
						<label for="contenu">Contenu de l'article :</label>
						<textarea id="contenu" name="contenu" rows="20"></textarea>
					</p>
				</fieldset>
			</div>

			<fieldset class="submit">
				<p>
					<input type="submit" value="Publier" id="bouton_envoi" />
				</p>
			</fieldset>
		</form>
	</section>


	</main>

	<footer>
		<%@include file="../../jsptoinclude/Footer.jsp"%>
	</footer>


</body>