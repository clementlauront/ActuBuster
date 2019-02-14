<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="fr">

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
			Nom : Nomdulogin <br /> Pr�nom : Pr�nomdulogin <br /> Pseudo :
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
						<label for="nom">Pr�nom :</label> <input type="text" id="prenom"
							name="prenom" placeholder="Pr�nomdulogin" />
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