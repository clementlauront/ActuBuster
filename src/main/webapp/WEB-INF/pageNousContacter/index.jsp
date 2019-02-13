<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="fr">

<head>
    <meta charset="utf-8">
    <link rel="icon" href="actu_busters.ico">
    <title>Nous contacter</title>
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

        <section id="box_contact" class="contact">
            <h2>Nous contacter</h2>

            <div id="adresse">
                <h3>Adresse</h3>
                <p>2 rue crucy
                    </br>CS 60515
                    </br>44005 Nantes
                </p>
            </div id="lesplusbeaux">
            <h3>Qui sommes-nous</h3>
            <img src="Clement.jpg" alt="Clément"><a href="https://www.linkedin.com/in/cl%C3%A9ment-lauront/"><img
                    src="icon_linkedin.png" alt="LinkedIn_clément">Clément Lauront</a>
            <img src="Alexandre.jpg" alt="Alexandre"><a
                href="https://www.linkedin.com/in/alexandre-grondin-34b54112a/"><img src="icon_linkedin.png"
                    alt="LinkedIn_alexandre">Alexandre Grondin</a>
            <img src="Andrea.jpg" alt="Andréa"><a
                href="https://www.linkedin.com/in/andr%C3%A9a-fonteneau-47085a173/"><img src="icon_linkedin.png"
                    alt="LinkedIn_andréa">Andréa Fonteneau</a>

            <div>

        </section>

        <section id="box_message" class="contact">
            <h2>Nous envoyer un message</h2>
            <form method="post" action="envoi.php">
                <div id="container-message">
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
                            <label for="email">E-mail :</label>
                            <input type="email" id="email" name="email" placeholder="e-mail" required="required" />
                        </p>

                    </fieldset>

                    <fieldset>
                        <p>
                            <label for="objet">Objet :</label>
                            <input type="text" id="objet" name="objet" placeholder="Objet" required="required" />
                        </p>

                        <p>
                            <label for="comments">Votre message :</label>
                            <textarea id="comments" row="10"></textarea>
                        </p>
                    </fieldset>
                </div>

                <fieldset class="submit">
                    <p>
                        <input type="submit" value="Envoyer" id="bouton_envoi" />
                    </p>
                </fieldset>
            </form>
        </section>
    </main>

    <footer>
            <div class="row">
                <h2>Articles les plus lus</h2>
                <p><a class="posts" href="#">Best Article 1</a></p>
                <p><a class="posts" href="#">Best Article 2</a></p>
                <p><a class="posts" href="#">Best Article 3</a></p>
                <p><a class="posts" href="#">Best Article 4</a></p>
                <p><a class="posts" href="#">Best Article 5</a></p>
            </div>
    
            <div class="row">
                <div class="column">
                    <h2>Tags les plus lus</h2>
                    <a class="tags" href="#">Tag 1</a>
                    <a class="tags" href="#">Tag 2</a>
                    <a class="tags" href="#">Tag 3</a>
                    <a class="tags" href="#">Tag 4</a>
                    <a class="tags" href="#">Tag 5</a>
                </div>
                <div class="column">
                    <h2>Réseaux sociaux</h2>
                    <a href="#"><img src="icon_linkedin.png" alt="LinkedIn"></a>
                    <a href="#"><img src="icon_facebook.png" alt="Facebook"></a>
                    <a href="#"><img src="icon_twitter.png" alt="Twitter"></a>
                </div>
            </div>
        </footer>


</body>