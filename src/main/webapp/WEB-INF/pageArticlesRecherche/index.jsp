<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="fr">

<head>
<%@include file="../jsptoinclude/Head.jsp"%>
</head>

<body>
	<header>
		<%@include file="../jsptoinclude/Header.jsp"%>
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

	<section id="lesarticles">
		<h2>Les articles</h2>
		<form action="" class="formulaire">
			Barre de recherche : <input class="champ" type="text"
				value="Search..." /><input class="bouton" type="button" value="OK" />
		</form>
		<article class="article">
			<div class="img_box">
				<a href="#"> <img src="article1.jpg" alt="???">
				</a>
			</div>

			<div class="texte">
				<h1>Titre du tout dernier article publié</h1>
				<p>
					Catégorie : <a href="#">Catégorie</a>
				</p>
				<p>
					Tags : <a href="#">Tag 1</a><a href="#">Tag 2</a><a href="#">Tag
						3</a>
				</p>
				<p>(Chapeau) Sed ut perspiciatis unde omnis iste natus error sit
					voluptatem accusantium doloremque laudantium, totam rem aperiam,
					eaque ipsa quae ab illo inventore veritatis et quasi architecto
					beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia
					voluptas sit aspernatur aut odit aut fugit.</p>
				<div class="signature">
					<p>
						Par <a href="#">Journaliste</a> le 23 février, 2017.
					</p>
					<p>
						<button>
							<a href="#">Ajouter</a>
						</button>
						<button>
							<a href="#">Supprimer</a>
						</button>
						<a href="#">Lire</a>
					</p>

				</div>
			</div>
		</article>

		<article class="article">
			<div class="img_box">
				<a href="#"> <img src="article2.jpg" alt="???">
				</a>
			</div>

			<div class="texte">
				<h1>Titre du deuxième dernier article publié</h1>
				<p>
					Catégorie : <a href="#">Catégorie</a>
				</p>
				<p>
					Tags : <a href="#">Tag 1</a><a href="#">Tag 2</a><a href="#">Tag
						3</a>
				</p>
				</p>
				<p>(Chapeau) Sed ut perspiciatis unde omnis iste natus error sit
					voluptatem accusantium doloremque laudantium, totam rem aperiam,
					eaque ipsa quae ab illo inventore veritatis et quasi architecto
					beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia
					voluptas sit aspernatur aut odit aut fugit.</p>
				<div class="signature">
					<p>
						Par <a href="#">Journaliste</a> le 23 février, 2017.
					</p>
					<p>
						<button>
							<a href="#">Ajouter</a>
						</button>
						<button>
							<a href="#">Supprimer</a>
						</button>
						<a href="#">Lire</a>
					</p>
				</div>
			</div>
		</article>

	</section>

	</main>

	<footer>
		<%@include file="../jsptoinclude/Footer.jsp"%>
	</footer>


</body>