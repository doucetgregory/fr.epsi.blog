package fr.epsi.blog.servlets;

import fr.epsi.blog.beans.Utilisateur;
import fr.epsi.blog.dao.UtilisateurDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
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
        String email = request.getParameter("utilisateur_getEmail");
        String mdp = request.getParameter("utilisateur_getPassword");

        try {
            Utilisateur utilisateur = utilisateurDao.getUtilisateur(email,mdp);
            System.out.println(utilisateur);
            if (utilisateur.getEmail() != null || utilisateur.getEmail().length() > 0) {
                request.getRequestDispatcher("listBlogs.jsp").forward(request,response);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Requete erroné !! Recupere un utilisateur");
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
