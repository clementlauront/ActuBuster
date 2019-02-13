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
               <%@include file="../jsptoinclude/Menu.jsp" %>
            </nav>
        </aside>

        <section id="lesarticles">
            <h2>Les derniers articles</h2>
            <article class="article">
                <div class="img_box">
                    <a href="#">
                        <img src="article1.jpg" alt="???">
                    </a>
                </div>

                <div class="texte">
                    <h1>Titre du tout dernier article publi�</h1>
                    <p>Cat�gorie : <a href="#">Cat�gorie</a></p>
                    <p>Tags : <a href="#">Tag 1</a><a href="#">Tag 2</a><a href="#">Tag 3</a></p>
                    <p>(Chapeau) Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque
                        laudantium,
                        totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto
                        beatae vitae
                        dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit
                        aut
                        fugit.
                    </p>
                    <div class="signature">
                        <p>Par <a href="#">Journaliste</a> le 23 f�vrier, 2017.</p>
                        <p><button><a href="#">Ajouter</a></button><a href="#">Lire</a></p>

                    </div>
                </div>
            </article>

            <article class="article">
                <div class="img_box">
                    <a href="#">
                        <img src="article2.jpg" alt="???">
                    </a>
                </div>

                <div class="texte">
                    <h1>Titre du deuxi�me dernier article publi�</h1>
                    <p>Cat�gorie : <a href="#">Cat�gorie</a></p>
                    <p>Tags : <a href="#">Tag 1</a><a href="#">Tag 2</a><a href="#">Tag 3</a></p>
                    <p>(Chapeau) Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque
                        laudantium,
                        totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto
                        beatae vitae
                        dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit
                        aut
                        fugit.
                    </p>
                    <div class="signature">
                        <p>Par <a href="#">Journaliste</a> le 23 f�vrier, 2017.</p>
                        <p><button><a href="#">Ajouter</a></button><a href="#">Lire</a></p>
                    </div>
                </div>
            </article>
        </section>

    </main>

    <footer>
        <%@include file="../jsptoinclude/Footer.jsp" %>
    </footer>


</body>