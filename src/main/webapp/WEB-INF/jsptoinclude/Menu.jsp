<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page  isELIgnored ="false" %>
<html>
<head>
<meta charset="ISO-8859-1">

</head>
<body>
  <aside>
            <nav>
                <div class="espace_login">
                    <img src="img_login.jpg" alt="img_login">
                    <p><c:out value =$"{sessionScope.LOGGEUR.pseudo}"/></p>
                </div>
                <ul>
                    <li><a href="/ActuBuster/ArticleDetail">Articles</a></li>
                    <ul>
                        <li><a href="#">Catégorie 1</a></li>
                        <li><a href="#">Catégorie 2</a></li>
                        <li><a href="#">Catégorie 3</a></li>
                    </ul>
                    <li id="connexion"><a href="/ActuBuster/Connexion">Connexion</a></li>

                    <li id="gestionAdmin"><a href="#">Gestion admin</a>
                    <ul>
                        <li><a href="/ActuBuster/Infos">Mes infos</a></li>
                        <li><a href="/ActuBuster/AdministrationDuSite">Liste des membres</a></li>
                        <li><a href="#">Messages reçus</a></li>
                        <li><a href="#">Déconnexion</a></li>
                    </ul>
                    </li>

                    <li id="gestionJournaliste"><a href="#">Gestion journaliste</a>
                    <ul>
                        <li><a href="/ActuBuster/Infos">Mes infos</a></li>
                        <li><a href="#">Mes articles</a></li>
                        <li id="deconnexion"><a href="/ActuBuster/Deconnexion">Déconnexion</a></li>
                    </ul>
                    </li>

                    <li id="gestionMembre"><a href="#">Gestion membre</a>
                    <ul>
                        <li><a href="/ActuBuster/Infos">Mes infos</a></li>
                        <li><a href="#">Mes favoris</a></li>
                        <li><a href="/ActuBuster/Deconnexion">Déconnexion</a></li>
                    </ul>
                    </li>
                    <li><a href="/ActuBuster/NousContacter">Nous contacter</a></li>
                </ul>
            </nav>
        </aside>

<script>

	var niveau = "<c:out value= "${sessionScope.LOGGEUR.niveaux}"/>";
	
	
	
	if (niveau == "") {
		document.getElementById('gestionMembre').style.display = "none";
		document.getElementById('gestionJournaliste').style.display = "none";
		document.getElementById('gestionAdmin').style.display = "none";
		document.getElementById('deconnexion').style.display = "none";

		} else if (niveau != "") {

			if (niveau == "ADMIN") {
				document.getElementById('gestionMembre').style.display = "none";
				document.getElementById('gestionJournaliste').style.display = "none";
				document.getElementById('connexion').style.display = "none";


			} else if (niveau == "JOURNALISTE") {
				document.getElementById('gestionAdmin').style.display = "none";
				document.getElementById('gestionMembre').style.display = "none";
				document.getElementById('connexion').style.display = "none";


			} else if (niveau == "CLIENT") {
				document.getElementById('gestionAdmin').style.display = "none";
				document.getElementById('gestionJournaliste').style.display = "none";
				document.getElementById('connexion').style.display = "none";


			}
		}

</script>

</body>

</html>