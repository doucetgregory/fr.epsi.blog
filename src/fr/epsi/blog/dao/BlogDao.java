package fr.epsi.blog.dao;

import fr.epsi.blog.beans.Blog;
import fr.epsi.blog.beans.Reponse;
import fr.epsi.blog.beans.Utilisateur;

import java.sql.SQLException;
import java.util.List;

public class BlogDao implements IBlogDao {
    @Override
    public Blog getBlog(Integer id) {
        return null;
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
