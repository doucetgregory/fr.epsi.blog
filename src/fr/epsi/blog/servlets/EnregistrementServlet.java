package fr.epsi.blog.servlets;

import fr.epsi.blog.beans.Utilisateur;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class PingServlet
 */
@WebServlet("/Enregistrement")
public class EnregistrementServlet extends HttpServlet {

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     * @param request
     * @param responseion de
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response) {

        String nom = request.getParameter("utilisateur_nom");
        String email = request.getParameter("utilisateur_email");
        String mdp = request.getParameter("utilisateur_mdp");
        System.out.println(request.getParameter("utilisateur_admin"));
        boolean admin = false;
        if (Integer.parseInt(request.getParameter("utilisateur_admin")) == 1) {
            admin = true;
        }

        Utilisateur utilisateur = new Utilisateur(nom, email, mdp, admin);

        System.out.println(utilisateur);

    }

}
