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
            <h2>Mes articles</h2>
            <form action="" class="formulaire">Barre de recherche : <input class="champ" type="text"
                    value="Search..." /><input class="bouton" type="button" value="OK" />
            </form>
            <a href="#">Rédiger un article</a>
            <article class="article">
                <div class="img_box">
                    <a href="#">
                        <img src="article1.jpg" alt="???">
                    </a>
                </div>

                <div class="texte">
                    <h1>Titre du tout dernier article rédigé</h1>
                    <p>Catégorie : <a href="#">Catégorie</a></p>
                    <p>Tags : <a href="#">Tag 1</a><a href="#">Tag 2</a><a href="#">Tag 3</a></p>
                    <p>(Chapeau) Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque
                        laudantium,
                        totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae
                        dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut
                        fugit.
                    </p>
                    <div class="signature">
                        <p>Par <a href="#">Journaliste</a> le 23 février, 2017.</p>
                        <p><a href="#">Lire</a><input type="button" onClick="bascule('boite1');"
                                value="Modifier l'article">
                            <div name="boite2" id="boite1" style="visibility: hidden">
                                <form>
                                    <div class="container-modification">
                                        <fieldset>

                                            <p>
                                                <label for="titre">Titre :</label>
                                                <input type="text" id="titre" name="titre" placeholder="Titre initial"
                                                    required="required" />
                                            </p>

                                            <p>
                                                <label for="categorie">Catégories :</label>
                                                <SELECT name="categorie" size="1">
                                                    <OPTION selected>Catégorie initiale
                                                    <OPTION>Catégorie 1
                                                    <OPTION>Catégorie 2
                                                    <OPTION>Catégorie 3
                                                </SELECT>
                                            </p>

                                            <p>
                                                <label for="tag">Tags :</label>
                                                <SELECT name="tag" size="1">
                                                    <OPTION selected>Tag1 initial
                                                    <OPTION>Tag 1
                                                    <OPTION>Tag 2
                                                    <OPTION>Tag 3
                                                </SELECT>
                                                <SELECT name="tag" size="1">
                                                    <OPTION selected>Tag2 initial
                                                    <OPTION>Tag 1
                                                    <OPTION>Tag 2
                                                    <OPTION>Tag 3
                                                </SELECT>
                                                <SELECT name="tag" size="1">
                                                    <OPTION selected>Tag3 initial
                                                    <OPTION>Tag 1
                                                    <OPTION>Tag 2
                                                    <OPTION>Tag 3
                                                </SELECT>
                                            </p>

                                            <p>
                                                <label for="image">Image :</label>
                                                <input type="file" id="avatar" name="avatar"
                                                    accept="image/png, image/jpeg, image/gif">
                                            </p>
                                        </fieldset>

                                        <fieldset>
                                            <p>
                                                <label for="chapeau">Chapeau de l'article :</label>
                                                <textarea id="chapeau" row="3"
                                                    placeholder="(Chapeau initial) Immobilis Romana regionem celebritati regionem flagitii ripas proditus ripas dux ullo ad ad indicio praesidia Aboraeque praesidia solitudines admissi egressus."></textarea>
                                            </p>
                                            <p>
                                                <label for="contenu">Contenu de l'article :</label>
                                                <textarea id="contenu" row="20"
                                                    placeholder="Eodem tempore Serenianus ex duce, cuius ignavia populatam in Phoenice Celsen ante rettulimus, pulsatae maiestatis imperii reus iure postulatus ac lege, incertum qua potuit suffragatione absolvi, aperte convictus familiarem suum cum pileo, quo caput operiebat, incantato vetitis artibus ad templum misisse fatidicum, quaeritatum expresse an ei firmum portenderetur imperium, ut cupiebat, et cunctum."></textarea>
                                            </p>
                                        </fieldset>
                                        <fieldset class="submit">
                                            <p>
                                                <input type="submit" value="Appliquer les modifications"
                                                    id="bouton_envoi" />
                                            </p>
                                        </fieldset>
                                    </div>
                                </form>
                            </div>
                        </p>
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
                    <h1>Titre du deuxième dernier article rédigé</h1>
                    <p>Catégorie : <a href="#">Catégorie</a></p>
                    <p>Tags : <a href="#">Tag 1</a><a href="#">Tag 2</a><a href="#">Tag 3</a></p>
                    <p>(Chapeau) Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque
                        laudantium,
                        totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae
                        dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut
                        fugit.
                    </p>
                    <div class="signature">
                        <p>Par <a href="#">Journaliste</a> le 23 février, 2017.</p>
                        <p><a href="#">Lire</a><input type="button" onClick="bascule('boite2');"
                                value="Modifier l'article">
                            <div name="boite2" id="boite2" style="visibility: hidden">
                                <form>
                                    <fieldset>

                                        <p>
                                            <label for="titre">Titre :</label>
                                            <input type="text" id="titre" name="titre" placeholder="Titre initial"
                                                required="required" />
                                        </p>

                                        <p>
                                            <label for="categorie">Catégories :</label>
                                            <SELECT name="categorie" size="1">
                                                <OPTION selected>Catégorie initiale
                                                <OPTION>Catégorie 1
                                                <OPTION>Catégorie 2
                                                <OPTION>Catégorie 3
                                            </SELECT>
                                        </p>

                                        <p>
                                            <label for="tag">Tags :</label>
                                            <SELECT name="tag" size="1">
                                                <OPTION selected>Tag1 initial
                                                <OPTION>Tag 1
                                                <OPTION>Tag 2
                                                <OPTION>Tag 3
                                            </SELECT>
                                            <SELECT name="tag" size="1">
                                                <OPTION selected>Tag2 initial
                                                <OPTION>Tag 1
                                                <OPTION>Tag 2
                                                <OPTION>Tag 3
                                            </SELECT>
                                            <SELECT name="tag" size="1">
                                                <OPTION selected>Tag3 initial
                                                <OPTION>Tag 1
                                                <OPTION>Tag 2
                                                <OPTION>Tag 3
                                            </SELECT>
                                        </p>

                                        <p>
                                            <label for="image">Image :</label>
                                            <input type="file" id="avatar" name="avatar"
                                                accept="image/png, image/jpeg, image/gif">
                                        </p>
                                    </fieldset>

                                    <fieldset>
                                        <p>
                                            <label for="chapeau">Chapeau de l'article :</label>
                                            <textarea id="chapeau" row="3"
                                                placeholder="(Chapeau initial) Immobilis Romana regionem celebritati regionem flagitii ripas proditus ripas dux ullo ad ad indicio praesidia Aboraeque praesidia solitudines admissi egressus."></textarea>
                                        </p>
                                        <p>
                                            <label for="contenu">Contenu de l'article :</label>
                                            <textarea id="contenu" row="20"
                                                placeholder="Eodem tempore Serenianus ex duce, cuius ignavia populatam in Phoenice Celsen ante rettulimus, pulsatae maiestatis imperii reus iure postulatus ac lege, incertum qua potuit suffragatione absolvi, aperte convictus familiarem suum cum pileo, quo caput operiebat, incantato vetitis artibus ad templum misisse fatidicum, quaeritatum expresse an ei firmum portenderetur imperium, ut cupiebat, et cunctum."></textarea>
                                        </p>
                                    </fieldset>
                                    <fieldset class="submit">
                                        <p>
                                            <input type="submit" value="Appliquer les modifications"
                                                id="bouton_envoi" />
                                        </p>
                                    </fieldset>
                                </form>
                            </div>
                        </p>
                    </div>
                </div>
            </article>

        </section>

        <script language="Javascript">
            function bascule(elem) {
                // Quel est l'état actuel ? 
                etat = document.getElementById(elem).style.visibility;
                if (etat == "hidden") { document.getElementById(elem).style.visibility = "visible"; }
                else { document.getElementById(elem).style.visibility = "hidden"; }
            } 
        </script>

    </main>

    <footer>
        <%@include file="../jsptoinclude/Footer.jsp" %>
    </footer>


</body>