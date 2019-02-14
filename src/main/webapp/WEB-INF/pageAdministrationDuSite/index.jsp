<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
 <header>
        <%@include file="../../jsptoinclude/Header.jsp" %>
    </header>

    <main>

        <aside>
            <nav>
               <%@include file="../../jsptoinclude/Menu.jsp" %>
            </nav>
        </aside>

	<h1>Administration du site</h1>

	<section id="lesMembres">
		<h2>Les membres</h2>
		<form action="" class="formulaire">
			Rechercher : <input class="champ" type="text" value="Search..." /><input
				class="bouton" type="button" value="OK" />
		</form>

		<form action="/ActuBuster/AdministrationDuSite" method="post" name="supprimer">
			<captation>Liste des membres</captation>
			<table>
				<thead>
					<th>A supprimer</th>
					<th>ID</th>
					<th>Prénom</th>
					<th>Nom</th>
					<th>Pseudo</th>
					<th>E-mail</th>
					<th>Droits</th>
				</thead>
				<tbody>

					<c:forEach items="${listeAdmins}" var="admin">
						<tr>
							<td></td>
							<td><c:out value="${admin.id}" /></td>
							<td><c:out value="${admin.prenom}" /></td>
							<td><c:out value="${admin.nom}" /></td>
							<td><c:out value="${admin.pseudo}" /></td>
							<td><c:out value="${admin.email}" /></td>
							<td><c:out value="${admin.niveaux}" /></td>
						</tr>
					</c:forEach>
					<c:forEach items="${listeMembres}" var="membre">
						<tr>
							<td><input type="checkbox" id="membres"
								name="membresASupprimer" value=<c:out value="${membre.id}"/> /></td>
							<td><c:out value="${membre.id}" /></td>
							<td><c:out value="${membre.prenom}" /></td>
							<td><c:out value="${membre.nom}" /></td>
							<td><c:out value="${membre.pseudo}" /></td>
							<td><c:out value="${membre.email}" /></td>
							<td><c:out value="${membre.niveaux}" /></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<input type="hidden" name="supprimer" value="supprimerMembres">
			<input type="submit" value="Supprimer"/>
		</form>
	</section>


	<section id="lesArticles">
		<h2>Les articles</h2>
		<form action="" class="formulaire">
			Rechercher : <input class="champ" type="text" value="Search..." /><input
				class="bouton" type="button" value="OK" />
		</form>

		<form action="/ActuBuster/AdministrationDuSite" method="post" name="supprimer">
			<captation>Liste des articles</captation>
			<table>
				<thead>
					<th>A supprimer</th>
					<th>ID</th>
					<th>Titre</th>
					<th>Journaliste</th>
					<th>Categorie</th>
				</thead>
				<tbody>
					<c:forEach items="${listeArticles}" var="article">
						<tr>
							<td><input type="checkbox" id="articles"
								name="articlesASupprimer" value=<c:out value="${article.id}"/> /></td>
							<td><c:out value="${article.id}" /></td>
							<td><c:out value="${article.titre}" /></td>
							<td><c:out value="${article.auteur.prenom}" /> <c:out
									value="${article.auteur.nom}" /></td>
							<td><c:out value="${article.categorie}" /></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<input type="hidden" name="supprimer" value="supprimerArticles">
			<input type="submit" value="Supprimer"/>
		</form>
	</section>

</body>
</html>