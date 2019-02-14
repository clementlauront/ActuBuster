<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page  isELIgnored ="false" %>
<html lang="fr">

<head>
    <%@include file="../../jsptoinclude/Head.jsp"%>
</head>

<body>
    <header>
        <%@include file="../../jsptoinclude/Header.jsp"%>
    </header>
 <aside>
            <nav>
               <%@include file="../../jsptoinclude/Menu.jsp" %>
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
                            <input type="text" id="nom" name="nom" placeholder="Nom" required="required" value=<c:out value="${sessionScope.LOGGEUR.nom}"/>/>
                        </p>

                        <p>
                            <label for="nom">Prénom :</label>
                            <input type="text" id="prenom" name="prenom" placeholder="Prénom" required="required" value=<c:out value="${sessionScope.LOGGEUR.prenom}"/>/>
                        </p>

                        <p>
                            <label for="email">E-mail :</label>
                            <input type="email" id="email" name="email" placeholder="e-mail" required="required" value=<c:out value="${sessionScope.LOGGEUR.email}"/>/>
                        </p>

                    </fieldset>

                    <fieldset>
                        <p>
                            <label for="objet">Objet :</label>
                            <input type="text" id="objet" name="objet" placeholder="Objet" required="required" />
                        </p>

                        <p>
                            <label for="comments">Votre message :</label>
                            <textarea id="comments" name="commentaire" rows="10"></textarea>
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
            <%@include file="../../jsptoinclude/Footer.jsp"%>
        </footer>


</body>