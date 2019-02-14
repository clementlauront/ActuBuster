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

        <section id="box_message" class="contact">
            <h2>Nous envoyer un message</h2>
            <form method="post" action="/ActuBuster/AfficherMessages">
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
                        <input type="submit" id="messageEnvoye" value="Envoyer" id="bouton_envoi"/>
                    </p>
                </fieldset>
            </form>
        </section>
    </main>

	<script>
	
	</script>

    <footer>
            <%@include file="../../jsptoinclude/Footer.jsp"%>
        </footer>


</body>