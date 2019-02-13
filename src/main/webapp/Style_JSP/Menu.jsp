<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

</head>
<body>
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

                    <li id="gestionAdmin"><a href="#">Gestion admin</a>
                    <ul>
                        <li><a href="#">Mes infos</a></li>
                        <li><a href="#">Liste des journalistes</a></li>
                        <li><a href="#">Liste des membres</a></li>
                        <li><a href="#">Messages reçus</a></li>
                        <li><a href="#">Déconnexion</a></li>
                    </ul>
                    </li>

                    <li id="gestionJournaliste"><a href="#">Gestion journaliste</a>
                    <ul>
                        <li><a href="#">Mes infos</a></li>
                        <li><a href="#">Mes articles</a></li>
                        <li><a href="#">Déconnexion</a></li>
                    </ul>
                    </li>

                    <li id="gestionMembre"><a href="#">Gestion membre</a>
                    <ul>
                        <li><a href="#">Mes infos</a></li>
                        <li><a href="#">Mes favoris</a></li>
                        <li><a href="#">Déconnexion</a></li>
                    </ul>
                    </li>
                    <li><a href="#">Nous contacter</a></li>
                </ul>
            </nav>
        </aside>

</body>
<script>
	var niveau =<% request.getAttribute("niveau");%>;
	if(niveau == null){
		niveau=2;
	}else if(niveau != null){
		
	if(niveau==0){
		document.getElementById('gestionMembre').style.display = "none"; 
		document.getElementById('gestionJournaliste').style.display = "none";
		
		
	}else if(niveau==1){
		document.getElementById('gestionAdmin').style.display = "none";
		document.getElementById('gestionMembre').style.display = "none";
		
		
	}else if(niveau==2){
		document.getElementById('gestionAdmin').style.display = "none";
		document.getElementById('gestionJournaliste').style.display = "none";
		
	}
	}
	

</script>
</html>