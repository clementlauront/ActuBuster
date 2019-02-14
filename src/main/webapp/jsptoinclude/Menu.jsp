<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page  isELIgnored ="false" %>

<meta charset="ISO-8859-1">
<link rel="stylesheet" href="style_menu.css">

<body>
  <aside>
            <nav>
                <div class="espace_login">
                    <img src="img_login.jpg" alt="img_login">
                    <p id="IconePseudo"></p>
                </div>
                <ul>
                    <li><a href="/ActuBuster/ArticlesRecherche">Articles</a></li>
                    
                    <li id="connexion"><a href="/ActuBuster/Connexion">Connexion</a></li>

                    <li id="gestionAdmin">Gestion admin
                    <ul>
                        <li><a href="/ActuBuster/Infos">Mes infos</a></li>
                        <li><a href="/ActuBuster/AdministrationDuSite">Gérer les membres et les articles</a></li>
                        <li><a href="/ActuBuster/AfficherMessages">Gérer les messages</a></li>
                        <li><a href="/ActuBuster/Deconnexion">Déconnexion</a></li>
                    </ul>
                    </li>

                    <li id="gestionJournaliste">Gestion journaliste
                    <ul>
                        <li><a href="/ActuBuster/Infos">Mes infos</a></li>
                        <li><a href="/ActuBuster/ArticlesJournaliste">Mes articles</a></li>
                        <li id="deconnexion"><a href="/ActuBuster/Deconnexion">Déconnexion</a></li>
                    </ul>
                    </li>

                    <li id="gestionMembre">Gestion membre
                    <ul>
                        <li><a href="/ActuBuster/Infos">Mes infos</a></li>
                        <li><a href="/ActuBuster/Deconnexion">Déconnexion</a></li>
                    </ul>
                    </li>
                    <li><a href="/ActuBuster/NousContacter">Nous contacter</a></li>
                </ul>
            </nav>
        </aside>

<script>
	//Instanciation de deux variables récupérées partir de la session
	var niveau = "<c:out value= "${sessionScope.LOGGEUR.niveaux}"/>"; // Si pas de session, cela retourne "" et pas null
	var pseudo = "<c:out value= "${sessionScope.LOGGEUR.pseudo}"/>"
	
	//Menu dynamique en javascript
	// Apparition du menu en fonction du niveau de l'utilisateur
	if (niveau == "") {
		//Commandes pour cacher les élèments HTML ayant les ID ci-dessous
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
	//Apparation du pseudo de l'utilisateur ou "visiteur"
	if (pseudo ==""){
		//Mettre le texte ci-dessous a l'emplacement HTML indiquée par l'Id
		document.getElementById('IconePseudo').innerHTML ="Visiteur";
	}else {
		document.getElementById('IconePseudo').innerHTML = "<c:out value="${sessionScope.LOGGEUR.pseudo}"/>";
	}

</script>

</body>

