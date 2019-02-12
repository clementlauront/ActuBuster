<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page  isELIgnored ="false" %> --%>
<html lang="fr">

<head>
    <meta charset="utf-8">
    <link rel="icon" href="actu_busters.ico">
    <title>Connexion</title>
    <link href="https://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet">
    <link rel="stylesheet" href="Accueil.css">
</head>

<body>
    <header>
        <div id="img_banniere"><a href="#"><img src="banniere.jpg" alt="Bannière"></a></div>
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
                    <li><a href="#">Quizz</a></li>
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
                        <li><a href="#">Mes quizz</a></li>
                        <li><a href="#">Déconnexion</a></li>
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

                        <p>
                            <label for="pseudo">Pseudo :</label>
                            <input type="text" id="pseudo" name="pseudo" placeholder="pseudo" required="required" />
                        </p>
                        <p>
                            <label for="email">E-mail :</label>
                            <input type="email" id="email" name="email" placeholder="e-mail" required="required" />
                        </p>

                        <p>
                            <label for="mdp">Mot de passe :</label>
                            <input type="text" id="mdp" name="mdp" placeholder="*********" required="required" />
                        </p>
                    </fieldset>
                </div>

                <fieldset class="submit">
                    <p>
                        <input type="submit" value="Connexion" id="bouton_envoi" />
                    </p>
<%--                     <p> <c:out value="${messageErreur}"/> </p>
 --%>                </fieldset>
            </form>
        </section>

        <section class="inscription">
            <form method="post" action="/ActuBuster/Connexion">
                <div class="container-inscription">
                    <fieldset>

                        <p>
                            <label for="nom">Nom :</label>
                            <input type="text" id="nom" name="nom" placeholder="Nom" required="required" />
                        </p>

                        <p>
                            <label for="nom">Prénom :</label>
                            <input type="text" id="prenom" name="prenom" placeholder="Prénom" required="required" />
                        </p>

                        <p>
                            <label for="pseudo">Pseudo :</label>
                            <input type="text" id="pseudo" name="pseudo" placeholder="Pseudo" required="required" />
                        </p>
                        <p>
                            <label for="email">E-mail :</label>
                            <input type="email" id="email" name="email" placeholder="e-mail" required="required" />
                        </p>

                        <p>
                            <label for="mdp">Mot de passe :</label>
                            <input type="text" class="mdp" name="mdp" placeholder="*********" required="required" />
                        </p>

                        <p>
                            <label for="mdp">Confirmation du mot de passe :</label>
                            <input type="text" class="mdp" name="mdp2" placeholder="*********" required="required" />
                        </p>

                    </fieldset>
                </div>

                <fieldset class="submit">
                    <p>
                        <input type="submit" value="Inscription" id="bouton_envoi" />
                    </p>
                </fieldset>
            </form>
        </section>


    </main>

    <footer>
        <div class="row">
            <h2>Meilleurs articles</h2>
            <p><a class="posts" href="#">Best Article 1</a></p>
            <p><a class="posts" href="#">Best Article 1</a></p>
            <p><a class="posts" href="#">Best Article 1</a></p>
            <p><a class="posts" href="#">Best Article 1</a></p>
            <p><a class="posts" href="#">Best Article 1</a></p>
        </div>

        <div class="row">
            <h2>Meilleurs quizz</h2>
            <p><a class="posts" href="#">Best Quizz 1</a></p>
            <p><a class="posts" href="#">Best Quizz 1</a></p>
            <p><a class="posts" href="#">Best Quizz 1</a></p>
            <p><a class="posts" href="#">Best Quizz 1</a></p>
            <p><a class="posts" href="#">Best Quizz 1</a></p>
        </div>

        <div class="row">
            <div class="column">
                <h2>Tags les plus tilisés</h2>
                <a class="tags" href="#">exclusive</a>
                <a class="tags" href="#">headline</a>
                <a class="tags" href="#">latest</a>
                <a class="tags" href="#">popular</a>
                <a class="tags" href="#">slider</a>
            </div>
            <div class="column">
                <h2>Réseaux sociaux</h2>
                <a href$="#"><img src="icon_linkedin.png" alt="LinkedIn"></a>
                <a href$="#"><img src="icon_facebook.png" alt="Facebook"></a>
                <a href$="#"><img src="icon_twitter.png" alt="Twitter"></a>
            </div>
        </div>
    </footer>


</body>