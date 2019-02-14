<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="fr">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page  isELIgnored ="false" %>

<head>
	<%@include file="../../jsptoinclude/Head.jsp"%>
</head>

<body>
	<header>
		<%@include file="../../jsptoinclude/Header.jsp" %>
	</header>

	<main>
 <aside>
            <nav>
               <%@include file="../../jsptoinclude/Menu.jsp" %>
            </nav>
        </aside>


	<section class="infos">
		<h2>Mes infos</h2>

		<p>
			Nom : <c:out value="${sessionScope.LOGGEUR.nom}"/> <br /> Pr�nom : <c:out value="${sessionScope.LOGGEUR.prenom}"/> <br /> Pseudo :
			<c:out value="${sessionScope.LOGGEUR.pseudo}"/> <br /> E-mail : <c:out value="${sessionScope.LOGGEUR.email}"/>
		</p>

	</section>

	<input type="button" onClick="bascule('boite');"
		value="Modifier les infos">
	<div name="boite" id="boite" style="visibility: hidden">
		<form method="post">
			<div class="container-modification">
				<fieldset>
				
		<input type="hidden" id="id" name="id" value=<c:out value="${sessionScope.LOGGEUR.id}"/> />

					<p>
						<label for="nom">Nom :</label> <input type="text" id="nom"
							name="nom" placeholder=<c:out value="${sessionScope.LOGGEUR.nom}"/> />
					</p>

					<p>
						<label for="nom">Pr�nom :</label> <input type="text" id="prenom"
							name="prenom" placeholder=<c:out value="${sessionScope.LOGGEUR.prenom}"/> />
					</p>

					<p>
						<label for="pseudo">Pseudo :</label> <input type="text"
							id="pseudo" name="pseudo" placeholder=<c:out value="${sessionScope.LOGGEUR.pseudo}"/> />
					</p>
					<p>
						<label for="email">E-mail :</label> <input type="email" id="email"
							name="email" placeholder=<c:out value="${sessionScope.LOGGEUR.email}"/> />
					</p>

					<p>
						<label for="mdp">Nouveau mot de passe :</label> <input
							type="password" id="mdp" name="mdp" placeholder="*********" />
					</p>

					<p>
						<label for="mdp">Confirmation du mot de passe :</label> <input
							type="password" id="mdp2" name="mdp2" placeholder="*********" />
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
			// Quel est l'�tat actuel ? 
			etat = document.getElementById(elem).style.visibility;
			if (etat == "hidden") {
				document.getElementById(elem).style.visibility = "visible";
			} else {
				document.getElementById(elem).style.visibility = "hidden";
			}
		}
	</script> </main>

	<footer>
		<%@include file="../../jsptoinclude/Footer.jsp" %>
	</footer>


</body>