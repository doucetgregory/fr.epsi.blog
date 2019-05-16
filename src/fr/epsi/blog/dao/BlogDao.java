package fr.epsi.blog.dao;

import fr.epsi.blog.beans.Blog;
import fr.epsi.blog.beans.Reponse;
import fr.epsi.blog.beans.Statut;
import fr.epsi.blog.beans.Utilisateur;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class BlogDao implements IBlogDao {
    @Override
    public Blog getBlog(Integer id) throws SQLException {

        Connection connection = PersistenceManager.getConnection();
        Blog blog=null;
        String requete = "SELECT p.id, p.titre, p.desccription, p.nbVue,p.dateCreation,p.dateModification,u.id, u.nom, u.email, u.password, u.dateCreation,u.admin,s.id,s.description FROM post p" +
                " INNER JOIN  user u ON u.id=p.auteur " +
                "INNER  JOIN status s ON s.id=p.status WHERE id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(requete);
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            Utilisateur utilisateur=new Utilisateur(resultSet.getInt(7),resultSet.getString(8),resultSet.getString(9),resultSet.getString(10),resultSet.getDate(11),resultSet.getBoolean(12));
            Statut statut=new Statut(resultSet.getInt(13),resultSet.getString(14));
            blog = new Blog(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getInt(4), utilisateur,resultSet.getDate(5), resultSet.getDate(6),statut);
        }

        return blog;

    }

    @Override
    public List<Blog> getBlogs(Utilisateur utilisateur) {
        return null;
    }

    @Override
    public Integer createBlog(Blog blog) throws SQLException {
        return null;
    }

    @Override
    public void updateBlog(Blog blog) throws SQLException {

    }

    @Override
    public void deleteBlog(Blog blog) throws SQLException {

    }

    @Override
    public void addReponse(Blog blog, Reponse reponse) throws SQLException {

    }
}
