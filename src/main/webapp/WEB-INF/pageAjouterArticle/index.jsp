<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="fr">

<head>
    <meta charset="utf-8">
    <link rel="icon" href="actu_busters.ico">
    <title>Gestion - R�diger un article</title>
    <link href="https://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet">
    <link rel="stylesheet" href="Accueil.css">
</head>

<body>
    <header>
        <div id="img_banniere"><a href="#"><img src="banniere.jpg" alt="Banni�re"></a></div>
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
            <h2>R�diger un article</h2>
            <form method="post" action="envoi.php">
                <div class="container-redaction">
                    <fieldset>

                        <p>
                            <label for="titre">Titre :</label>
                            <input type="text" id="titre" name="titre" placeholder="Titre" required="required" />
                        </p>

                        <p>
                            <label for="categorie">Cat�gories :</label>
                            <SELECT name="categorie" size="1">
                                <OPTION selected>Choisir une cat�gorie
                                <OPTION>Cat�gorie 1
                                <OPTION>Cat�gorie 2
                                <OPTION>Cat�gorie 3
                            </SELECT>
                        </p>

                        <p>
                            <label for="tag">Tags :</label>
                            <SELECT name="tag" size="1">
                                <OPTION selected>Choisir une cat�gorie
                                <OPTION>Tag 1
                                <OPTION>Tag 2
                                <OPTION>Tag 3
                            </SELECT>
                            <SELECT name="tag" size="1">
                                <OPTION selected>Choisir une cat�gorie
                                <OPTION>Tag 1
                                <OPTION>Tag 2
                                <OPTION>Tag 3
                            </SELECT>
                            <SELECT name="tag" size="1">
                                <OPTION selected>Choisir une cat�gorie
                                <OPTION>Tag 1
                                <OPTION>Tag 2
                                <OPTION>Tag 3
                            </SELECT>
                        </p>

                        <p>
                            <label for="image">Image :</label>
                            <input type="file" id="avatar" name="avatar" accept="image/png, image/jpeg, image/gif">
                        </p>
                    </fieldset>

                    <fieldset>
                        <p>
                            <label for="chapeau">Chapeau de l'article :</label>
                            <textarea id="chapeau" row="3"></textarea>
                        </p>
                        <p>
                            <label for="contenu">Contenu de l'article :</label>
                            <textarea id="contenu" row="20"></textarea>
                        </p>
                    </fieldset>
                </div>

                <fieldset class="submit">
                    <p>
                        <input type="submit" value="Publier" id="bouton_envoi" />
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
                    <h2>R�seaux sociaux</h2>
                    <a href="#"><img src="icon_linkedin.png" alt="LinkedIn"></a>
                    <a href="#"><img src="icon_facebook.png" alt="Facebook"></a>
                    <a href="#"><img src="icon_twitter.png" alt="Twitter"></a>
                </div>
            </div>
        </footer>


</body>