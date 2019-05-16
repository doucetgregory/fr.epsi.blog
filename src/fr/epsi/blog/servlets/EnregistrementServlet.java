package fr.epsi.blog.servlets;

import fr.epsi.blog.beans.Utilisateur;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;

/**
 * Servlet implementation class PingServlet
 */
@WebServlet("/Enregistrement")
public class EnregistrementServlet {

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response) {

        String nom = request.getParameter("utilisateur_nom");
        String email = request.getParameter("utilisateur_email");
        String mdp = request.getParameter("utilisateur_mdp");
        String admin = request.getParameter("utilisateur_admin");

        Utilisateur utilisateur = new Utilisateur()
/*
        if (userName.toLowerCase().equals(userNameDefault.toLowerCase()) && userMdp.equals(userMdpDefault)) {
            Utilisateur user = new Utilisateur("doucet@douc.fr", userName, userMdp);
            try {
                request.getRequestDispatcher("index.jsp").forward(request, response);

                // il ne reste plus qu'à envoyer l'objet dans la page et générer le html avec les données de l'objet

            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Mauvais identifiants !");
            UtilisateurDao utilisateurDao = new UtilisateurDao();
            try {
                utilisateurDao.getUtilisateur("");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        //response.getWriter().append("Connexion réussi ! Données suivantes :").append(request.)
*/
    }

}
