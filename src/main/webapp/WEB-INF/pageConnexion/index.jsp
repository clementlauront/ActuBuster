<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page  isELIgnored ="false" %>
<html lang="fr">

<head>
<%@include file="../jsptoinclude/Head.jsp"%>
</head>

<body>
	<header>
		<%@include file="../jsptoinclude/Header.jsp"%>
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
					<li><a href="#">Cat�gorie 1</a></li>
					<li><a href="#">Cat�gorie 2</a></li>
					<li><a href="#">Cat�gorie 3</a></li>
				</ul>
				<li><a href="#">Connexion</a></li>

				<li><a href="#">Gestion admin</a></li>
				<ul>
					<li><a href="#">Mes infos</a></li>
					<li><a href="#">Liste des journalistes</a></li>
					<li><a href="#">Liste des membres</a></li>
					<li><a href="#">Messages re�us</a></li>
					<li><a href="#">D�connexion</a></li>
				</ul>

				<li><a href="#">Gestion journaliste</a></li>
				<ul>
					<li><a href="#">Mes infos</a></li>
					<li><a href="#">Mes articles</a></li>
					<li><a href="#">D�connexion</a></li>
				</ul>

				<li><a href="#">Gestion membre</a></li>
				<ul>
					<li><a href="#">Mes infos</a></li>
					<li><a href="#">Mes favoris</a></li>
					<li><a href="#">D�connexion</a></li>
				</ul>
				<li><a href="#">Nous contacter</a></li>
			</ul>
		</nav>
	</aside>

	<section class="connexion">
		<h2>Connexion</h2>
		<form method="post" action="/ActuBuster/Connexion">
			<div class="container-connexion">
			<fieldset>
				<p><c:out value="${messageErreurConnexion}"/></p>
			</fieldset>
				<fieldset>

					<p>
						<label for="pseudo">Pseudo :</label> <input type="text"
							id="pseudo" name="pseudo" placeholder="pseudo"
							required="required" />
					</p>
					<p>
						<label for="email">E-mail :</label> <input type="email" id="email"
							name="email" placeholder="e-mail" required="required" />
					</p>

					<p>
						<label for="mdp">Mot de passe :</label> <input type="password"
							id="mdp" name="mdp" placeholder="*********" required="required" />
					</p>
				</fieldset>
			</div>

			<fieldset class="submit">
				<p>
					<input type="submit" value="Se connecter" id="bouton_envoi" />
				</p>
			</fieldset>
			
		</form>
	</section>

	<section class="inscription">
		<form method="post" action="/ActuBuster/Inscription">
			<div class="container-inscription">
			<fieldset>
				<p><c:out value="${messageErreurInscription}"/></p>
			</fieldset>
				<fieldset>

					<p>
						<label for="nom">Nom :</label> <input type="text" id="nom"
							name="nom" placeholder="Nom" required="required" />
					</p>

					<p>
						<label for="nom">Pr�nom :</label> <input type="text" id="prenom"
							name="prenom" placeholder="Pr�nom" required="required" />
					</p>

					<p>
						<label for="pseudo">Pseudo :</label> <input type="text"
							id="pseudo" name="pseudo" placeholder="Pseudo"
							required="required" />
					</p>
					<p>
						<label for="email">E-mail :</label> <input type="email" id="email"
							name="email" placeholder="e-mail" required="required" />
					</p>

					<p>
						<label for="mdp">Mot de passe :</label> <input type="password"
							class="mdp" name="mdp" placeholder="*********"
							required="required" />
					</p>

					<p>
						<label for="mdp">Confirmation du mot de passe :</label> <input
							type="password" class="mdp" name="mdp2" placeholder="*********"
							required="required" />
					</p>

				</fieldset>
			</div>

			<fieldset class="submit">
				<p>
					<input type="submit" value="S'inscrire" id="bouton_envoi" />
				</p>
			</fieldset>
			
		</form>
	</section>


	</main>

	<footer>
		<%@include file="../jsptoinclude/Footer.jsp"%>
	</footer>


</body>