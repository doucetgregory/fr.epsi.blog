package fr.epsi.blog.servlets;

import fr.epsi.blog.beans.Blog;
import fr.epsi.blog.dao.BlogDao;
import fr.epsi.blog.dao.PersistenceManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * Servlet implementation class AuthentificationServlet
 */
@WebServlet("/ListBlogs")
public class ListBlogsServlet extends HttpServlet {

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {

        BlogDao blogDao = new BlogDao();
        List<Blog> listBlogs =

    }

}
