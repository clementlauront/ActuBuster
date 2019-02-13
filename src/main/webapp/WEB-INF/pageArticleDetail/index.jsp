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
               <%@include file="../jsptoinclude/Menu.jsp" %>
            </nav>
        </aside>


	<section id="article">

		<article class="article">
			<h2>Titre de l'article en cours de lecture</h2>
			<p>
				Catégorie : <a href="#">Catégorie</a>
			</p>
			<p>
				Tags : <a href="#">Tag 1</a><a href="#">Tag 2</a><a href="#">Tag
					3</a>
			</p>
			<div class="head_box">
				<a href="#"> <img src="article1.jpg" alt="???">
				</a>
			</div>

			<div class="head_box">
				<p>(Chapeau de l'article) Qui Q pauci ore et profecto incidere
					solebat familiares Pompeio Q solebat saepe amantissime in in saepe
					admodum multa querella erat hominum in amantissime amantissime tum
					incidere hemicyclio memini P consul vel admodum una et odio
					profecto hemicyclio in vixerat.</p>
			</div>

			<div class="contenu">

				<p>(Contenu de l'article) Et hanc quidem praeter oppida multa
					duae civitates exornant Seleucia opus Seleuci regis, et
					Claudiopolis quam deduxit coloniam Claudius Caesar. Isaura enim
					antehac nimium potens, olim subversa ut rebellatrix interneciva
					aegre vestigia claritudinis pristinae monstrat admodum pauca. Cum
					autem commodis intervallata temporibus convivia longa et noxia
					coeperint apparari vel distributio sollemnium sportularum, anxia
					deliberatione tractatur an exceptis his quibus vicissitudo debetur,
					peregrinum invitari conveniet, et si digesto plene consilio id
					placuerit fieri, is adhibetur qui pro domibus excubat aurigarum aut
					artem tesserariam profitetur aut secretiora quaedam se nosse
					confingit. Apud has gentes, quarum exordiens initium ab Assyriis ad
					Nili cataractas porrigitur et confinia Blemmyarum, omnes pari sorte
					sunt bellatores seminudi coloratis sagulis pube tenus amicti,
					equorum adiumento pernicium graciliumque camelorum per diversa se
					raptantes, in tranquillis vel turbidis rebus: nec eorum quisquam
					aliquando stivam adprehendit vel arborem colit aut arva subigendo
					quaeritat victum, sed errant semper per spatia longe lateque
					distenta sine lare sine sedibus fixis aut legibus: nec idem
					perferunt diutius caelum aut tractus unius soli illis umquam
					placet.</p>
				<div class="signature">
					<p>
						Par <a href="#">Journaliste</a> le 23 février, 2017.
					</p>
					<p>
						<button>
							<a href="#">Ajouter</a>
							<button>
								<a href="#">Enlever</a>
							</button>
						</button>
						<button>
							<a href="#">Supprimer</a>
						</button>
						<a href="#">Retour</a>
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