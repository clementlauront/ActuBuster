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

	<main>

	<aside>
		<nav>
			<%@include file="../../jsptoinclude/Menu.jsp"%>
		</nav>
	</aside>

	<section>
		<form action="/ActuBuster/AfficherMessages" method="post">
			<captation>Liste des messages</captation>
			<div>
			<p>Affichage du message : </p>
			<p id="messageAffiche"></p>
			</div>
			<table>
				<thead>
					<th></th>
					<th>Prénom</th>
					<th>Nom</th>
					<th>E-mail</th>
					<th>Objet</th>
					<th>Date</th>

				</thead>
				<tbody>
					<c:forEach items="${listeMessages}" var="message">
						<tr>
							<td><input type="checkbox" id="messages"
								name="messagesASupprimer" value=<c:out value="${message.id}"/> /></td>
							<td><c:out value="${message.prenom}" /></td>
							<td><c:out value="${message.nom}" /></td>
							<td><c:out value="${message.email}" /></td>
							<td><c:out value="${message.objet}" /></td>
							<td><c:out value="${message.date}" /></td>
							<td><input type="button" onClick="afficherMessage('<c:out value="${message.contenu}" />')"
		value="Afficher le message"></td>
							</tr>
					</c:forEach>
				</tbody>
			</table>
			<input type="submit" value="Supprimer les messages cochés" />
		</form>
	</section>

	<script language="Javascript">
		function afficherMessage(messageAAfficher) {            
            document.getElementById('messageAffiche').innerHTML = messageAAfficher;
            }
	</script> </main>

	<footer>
		<%@include file="../../jsptoinclude/Footer.jsp"%>
	</footer>


</body>