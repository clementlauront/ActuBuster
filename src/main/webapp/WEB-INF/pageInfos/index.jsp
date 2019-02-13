<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="fr">

<head>
	<%@include file="../jsptoinclude/Head.jsp"%>
</head>

<body>
	<header>
		<%@include file="../jsptoinclude/Header.jsp" %>
	</header>

	<main>

	<aside>
		<nav>
			<div class="espace_login">
				<img src="img_login.jpg" alt="img_login">
				<p>Pseudo du login</p>
			</div>
			<ul>
				<li><a href="#">Articles</a></li>
				<ul>
					<li><a href="#">Catégorie 1</a></li>
					<li><a href="#">Catégorie 2</a></li>
					<li><a href="#">Catégorie 3</a></li>
				</ul>
				<li><a href="#">Connexion</a></li>

				<li><a href="#">Gestion admin</a></li>
				<ul>
					<li><a href="#">Mes infos</a></li>
					<li><a href="#">Liste des journalistes</a></li>
					<li><a href="#">Liste des membres</a></li>
					<li><a href="#">Messages reçus</a></li>
					<li><a href="#">Déconnexion</a></li>
				</ul>

				<li><a href="#">Gestion journaliste</a></li>
				<ul>
					<li><a href="#">Mes infos</a></li>
					<li><a href="#">Mes articles</a></li>
					<li><a href="#">Déconnexion</a></li>
				</ul>

				<li><a href="#">Gestion membre</a></li>
				<ul>
					<li><a href="#">Mes infos</a></li>
					<li><a href="#">Mes favoris</a></li>
					<li><a href="#">Déconnexion</a></li>
				</ul>
				<li><a href="#">Nous contacter</a></li>
			</ul>
		</nav>
	</aside>

	<section class="infos">
		<h2>Mes infos</h2>

		<p>
			Nom : Nomdulogin <br /> Prénom : Prénomdulogin <br /> Pseudo :
			Pseudodulogin <br /> E-mail : Emaildulogin <br /> Mot de passe :
			*********
		</p>

	</section>

	<input type="button" onClick="bascule('boite');"
		value="Modifier les infos">
	<div name="boite" id="boite" style="visibility: hidden">
		<form>
			<div class="container-modification">
				<fieldset>

					<p>
						<label for="nom">Nom :</label> <input type="text" id="nom"
							name="nom" placeholder="Nomdulogin" />
					</p>

					<p>
						<label for="nom">Prénom :</label> <input type="text" id="prenom"
							name="prenom" placeholder="Prénomdulogin" />
					</p>

					<p>
						<label for="pseudo">Pseudo :</label> <input type="text"
							id="pseudo" name="pseudo" placeholder="Pseudodulogin" />
					</p>
					<p>
						<label for="email">E-mail :</label> <input type="email" id="email"
							name="email" placeholder="Emaildulogin" />
					</p>

					<p>
						<label for="mdp">Nouveau mot de passe :</label> <input
							type="password" class="mdp" name="mdp" placeholder="*********" />
					</p>

					<p>
						<label for="mdp">Confirmation du mot de passe :</label> <input
							type="password" class="mdp" name="mdp2" placeholder="*********" />
					</p>
				</fieldset>
				<fieldset class="submit">
					<p>
						<input type="submit" value="Valider les modifications"
							id="bouton_envoi" />
					</p>
				</fieldset>
			</div>
		</form>
	</div>

	<script language="Javascript">
		function bascule(elem) {
			// Quel est l'état actuel ? 
			etat = document.getElementById(elem).style.visibility;
			if (etat == "hidden") {
				document.getElementById(elem).style.visibility = "visible";
			} else {
				document.getElementById(elem).style.visibility = "hidden";
			}
		}
	</script> </main>

	<footer>
		<%@include file="../jsptoinclude/Footer.jsp" %>
	</footer>


</body>