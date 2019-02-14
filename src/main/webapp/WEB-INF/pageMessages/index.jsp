<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="fr">

<head>
    <%@include file="../../jsptoinclude/Head.jsp" %>
</head>

<body>
    <header>
        <%@include file="../../jsptoinclude/Header.jsp" %>
    </header>

    <main>

      <aside>
            <nav>
               <%@include file="../../jsptoinclude/Menu.jsp" %>
            </nav>
        </aside>


        <section id="lesmessages">
            <h2>Liste des messages</h2>
            <form action="" class="formulaire">Rechercher : <input class="champ" type="text" value="Search..." /><input
                    class="bouton" type="button" value="OK" />
            </form>

            <table>
                <thead>
                    <th>Nom</th>
                    <th>Prénom</th>
                    <th>E-mail</th>
                    <th>Objet</th>
                    <th>Message</th>

                </thead>
                <tbody>
                    <tr>
                        <td>Nom-c1</td>
                        <td>Prénom-c1</td>
                        <td>email-c1</td>
                        <td>objet-c1</td>
                        <td>(message-c1) Excitavit hic ardor milites per municipia plurima, quae isdem conterminant, dispositos et castella, sed quisque serpentes latius pro viribus repellere moliens, nunc globis confertos, aliquotiens et dispersos multitudine superabatur ingenti, quae nata et educata inter editos recurvosque ambitus montium eos ut loca plana persultat et mollia, missilibus obvios eminus lacessens et ululatu truci perterrens.</td>
                        <td><button>Supprimer</button></td>
                    </tr>
                    <tr>
                        <td>Nom-c2</td>
                        <td>Prénom-c2</td>
                        <td>email-c2</td>
                        <td>objet-c2</td>
                        <td>(message-c2) Excitavit hic ardor milites per municipia plurima, quae isdem conterminant, dispositos et castella, sed quisque serpentes latius pro viribus repellere moliens, nunc globis confertos, aliquotiens et dispersos multitudine superabatur ingenti, quae nata et educata inter editos recurvosque ambitus montium eos ut loca plana persultat et mollia, missilibus obvios eminus lacessens et ululatu truci perterrens.</td>
                        <td><button>Supprimer</button></td>
                    </tr>

                    <tr>
                        <td>Nom-c3</td>
                        <td>Prénom-c3</td>
                        <td>email-c3</td>
                        <td>objet-c3</td>
                        <td>(message-c3) Excitavit hic ardor milites per municipia plurima, quae isdem conterminant, dispositos et castella, sed quisque serpentes latius pro viribus repellere moliens, nunc globis confertos, aliquotiens et dispersos multitudine superabatur ingenti, quae nata et educata inter editos recurvosque ambitus montium eos ut loca plana persultat et mollia, missilibus obvios eminus lacessens et ululatu truci perterrens.</td>
                        <td><button>Supprimer</button></td>
                    </tr>
                </tbody>
            </table>

        </section>


    </main>

    <footer>
             <%@include file="../../jsptoinclude/Footer.jsp" %>
        </footer>


</body>