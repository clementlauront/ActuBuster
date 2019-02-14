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
               <%@include file="../../jsptoinclude/Menu.jsp" %>
            </nav>
        </aside>


	<section class="connexion">
		<h2>Rédiger un article</h2>
		<form method="post" action="envoi.php">
			<div class="container-redaction">
				<fieldset>

					<p>
						<label for="titre">Titre :</label> <input type="text" id="titre"
							name="titre" placeholder="Titre" required="required" />
					</p>

					<p>
						<label for="categorie">Catégories :</label> <SELECT
							name="categorie" size="1">
							<OPTION selected>Choisir une catégorie
							<OPTION>Catégorie 1
							<OPTION>Catégorie 2
							<OPTION>Catégorie 3
						</SELECT>
					</p>

					<p>
						<label for="tag">Tags :</label> <SELECT name="tag" size="1">
							<OPTION selected>Choisir une catégorie
							<OPTION>Tag 1
							<OPTION>Tag 2
							<OPTION>Tag 3
						</SELECT> <SELECT name="tag" size="1">
							<OPTION selected>Choisir une catégorie
							<OPTION>Tag 1
							<OPTION>Tag 2
							<OPTION>Tag 3
						</SELECT> <SELECT name="tag" size="1">
							<OPTION selected>Choisir une catégorie
							<OPTION>Tag 1
							<OPTION>Tag 2
							<OPTION>Tag 3
						</SELECT>
					</p>

					<p>
						<label for="image">Image :</label> <input type="file" id="avatar"
							name="avatar" accept="image/png, image/jpeg, image/gif">
					</p>
				</fieldset>

				<fieldset>
					<p>
						<label for="chapeau">Chapeau de l'article :</label>
						<textarea id="chapeau" row="3"></textarea>
					</p>
					<p>
						<label for="contenu">Contenu de l'article :</label>
						<textarea id="contenu" row="20"></textarea>
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