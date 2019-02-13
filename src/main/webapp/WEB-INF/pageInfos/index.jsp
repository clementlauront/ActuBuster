<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="fr">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page  isELIgnored ="false" %>

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
               <%@include file="../jsptoinclude/Menu.jsp" %>
            </nav>
        </aside>


	<section class="infos">
		<h2>Mes infos</h2>

		<p>
			Nom : <c:out value="${nom}"/> <br /> Prénom : <c:out value="${prenom}"/> <br /> Pseudo :
			<c:out value="${pseudo}"/> <br /> E-mail : <c:out value="${email}"/> <br /> Mot de passe :
			<c:out value="${motdepasse}"/>
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
							name="nom" placeholder=<c:out placeholder="${nom}"/> />
					</p>

					<p>
						<label for="nom">Prénom :</label> <input type="text" id="prenom"
							name="prenom" placeholder=<c:out value="${prenom}"/> />
					</p>

					<p>
						<label for="pseudo">Pseudo :</label> <input type="text"
							id="pseudo" name="pseudo" placeholder=<c:out value="${pseudo}"/> />
					</p>
					<p>
						<label for="email">E-mail :</label> <input type="email" id="email"
							name="email" placeholder=<c:out value="${email}"/> />
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