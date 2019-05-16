package fr.epsi.blog.servlets;

import fr.epsi.blog.beans.Utilisateur;
import fr.epsi.blog.dao.UtilisateurDao;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;

/**
 * Servlet implementation class AuthentificationServlet
 */
@WebServlet("/Authentification")
public class AuthentificationServlet extends HttpServlet {

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {

        UtilisateurDao utilisateurDao = new UtilisateurDao();
        String email = request.getParameter("utilisateur_email");
        String mdp = request.getParameter("utilisateur_mdp");

        try {
            Utilisateur utilisateur = utilisateurDao.getUtilisateur(email);
            System.out.println(utilisateur);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Requete erroné !! Recupere un utilisateur");
        }


    }

}
