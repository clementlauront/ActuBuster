<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="fr">

<head>
    <%@include file="../jsptoinclude/Head.jsp" %>
</head>

<body>
    <header>
        <%@include file="../jsptoinclude/Header.jsp" %>
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

        <section id="lesmessages">
            <h2>Liste des messages</h2>
            <form action="" class="formulaire">Rechercher : <input class="champ" type="text" value="Search..." /><input
                    class="bouton" type="button" value="OK" />
            </form>

            <table>
                <thead>
                    <th>Nom</th>
                    <th>Prénom</th>
                    <th>E-mail</th>
                    <th>Objet</th>
                    <th>Message</th>

                </thead>
                <tbody>
                    <tr>
                        <td>Nom-c1</td>
                        <td>Prénom-c1</td>
                        <td>email-c1</td>
                        <td>objet-c1</td>
                        <td>(message-c1) Excitavit hic ardor milites per municipia plurima, quae isdem conterminant, dispositos et castella, sed quisque serpentes latius pro viribus repellere moliens, nunc globis confertos, aliquotiens et dispersos multitudine superabatur ingenti, quae nata et educata inter editos recurvosque ambitus montium eos ut loca plana persultat et mollia, missilibus obvios eminus lacessens et ululatu truci perterrens.</td>
                        <td><button>Supprimer</button></td>
                    </tr>
                    <tr>
                        <td>Nom-c2</td>
                        <td>Prénom-c2</td>
                        <td>email-c2</td>
                        <td>objet-c2</td>
                        <td>(message-c2) Excitavit hic ardor milites per municipia plurima, quae isdem conterminant, dispositos et castella, sed quisque serpentes latius pro viribus repellere moliens, nunc globis confertos, aliquotiens et dispersos multitudine superabatur ingenti, quae nata et educata inter editos recurvosque ambitus montium eos ut loca plana persultat et mollia, missilibus obvios eminus lacessens et ululatu truci perterrens.</td>
                        <td><button>Supprimer</button></td>
                    </tr>

                    <tr>
                        <td>Nom-c3</td>
                        <td>Prénom-c3</td>
                        <td>email-c3</td>
                        <td>objet-c3</td>
                        <td>(message-c3) Excitavit hic ardor milites per municipia plurima, quae isdem conterminant, dispositos et castella, sed quisque serpentes latius pro viribus repellere moliens, nunc globis confertos, aliquotiens et dispersos multitudine superabatur ingenti, quae nata et educata inter editos recurvosque ambitus montium eos ut loca plana persultat et mollia, missilibus obvios eminus lacessens et ululatu truci perterrens.</td>
                        <td><button>Supprimer</button></td>
                    </tr>
                </tbody>
            </table>

        </section>


    </main>

    <footer>
             <%@include file="../jsptoinclude/Footer.jsp" %>
        </footer>


</body>