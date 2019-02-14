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

	<form method="post" action="/ActuBuster/ModifierArticle">
		<h2>Modifier l'article</h2>
		<div class="container-redaction">
			<fieldset>

				<p>
					<label for="titre">Titre :</label> <input type="text" id="titre"
						name="titre" placeholder="Titre" value='<c:out value="${articleAModifier.titre}" />'>
				</p>

				<p>
					<label for="categorie">Catégorie :</label> <SELECT name="categorie"
						size="1">
						<OPTION value="AUCUNE" selected>GARDER LA MÊME CATEGORIE
						<OPTION value="GENERALE">GENERALE
						<OPTION value="CULTURE">CULTURE
						<OPTION value="SCIENCE">SCIENCE
						<OPTION value="TECHNOLOGIE">TECHNOLOGIE
						<OPTION value="SANTE">SANTE
						<OPTION value="SOCIETE">SOCIETE
						<OPTION value="POLITIQUE">POLITIQUE
						<OPTION value="HISTOIRE">HISTOIRE
						<OPTION value="FINANCE">FINANCE
						<OPTION value="JEUXVIDEO">JEUXVIDEO
						<OPTION value="ECOLOGIE">ECOLOGIE
					</SELECT>
				</p>

				<p>
					<label> Tags :</label> 
					<c:forEach items="${tagsArticle}" var="tag">
					<input type="text" name="tags" value='<c:out value="${tag.tags}" />'>					</c:forEach>
				</p>

				<p>
					<label for="image">Image :</label> <input type="file"
						id="illustration" name="illustration"
						accept="image/png, image/jpeg, image/gif">
				</p>
			</fieldset>

			<fieldset>
				<p>
					<label for="chapeau">Chapeau de l'article :</label>
					<textarea id="chapeau" name="chapeau" rows="3"><c:out value="${articleAModifier.chapeau}" /></textarea>
				</p>
				<p>
					<label for="contenu">Contenu de l'article :</label>
					<textarea id="contenu" name="contenu" rows="20"><c:out value="${articleAModifier.contenu}" /></textarea>
				</p>
			</fieldset>
		</div>
		
		<input type="hidden" name="id" value=<c:out value="${articleAModifier.id}" />>

		<fieldset class="submit">
			<p>
				<input type="submit" value="Modifier" id="bouton_modif" />
			</p>
		</fieldset>
	</form>

</body>
</html>