<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page  isELIgnored ="false" %>
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
							/>
					</p>
					<p>
						<label for="email">E-mail :</label> <input type="email" id="email"
							name="email" placeholder="e-mail"  />
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
						<label for="nom">Prénom :</label> <input type="text" id="prenom"
							name="prenom" placeholder="Prénom" required="required" />
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
		<%@include file="../../jsptoinclude/Footer.jsp"%>
	</footer>


</body>