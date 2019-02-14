<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
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
						</tr>
						<input type="button" onClick="bascule('contenuMessage');"
							value="Afficher le message">
						<div id="contenuMessage" style="visibility: hidden">
							<c:out value="${message.id}"/>
						</div>
					</c:forEach>
				</tbody>
			</table>
			<input type="submit" value="Supprimer les messages cochés" />
		</form>
	</section>

	<script language="Javascript">
		function bascule(elem) {
			// Quel est l'état actuel ? 
			etat = document.getElementById(elem).style.visibility;
			if (etat == "hidden") {
				document.getElementById(elem).style.visibility = "visible";
			} else {
				document.getElementById(elem).style.visibility = "hidden";
			}
		}
	</script> </main>

	<footer>
		<%@include file="../../jsptoinclude/Footer.jsp"%>
	</footer>


</body>