package fr.epsi.blog.dao;

import fr.epsi.blog.beans.Utilisateur;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UtilisateurDao implements IUtilisateurDao {

    @Override
    public Utilisateur getUtilisateur(String email) {
        return null;
    }

    @Override
    public void createUtilisateur(Utilisateur utilisateur) throws SQLException {

        Connection connection = PersistenceManager.getConnection();
        Statement statement = connection.createStatement();
        statement.executeUpdate("INSERT INTO user(nom, email, password, dateCreation, admin) VALUES(" + utilisateur.getNom() + ", " + utilisateur.getEmail() + ", " + utilisateur.getPassword() + ", " + utilisateur.getDateCreation() + ", " + utilisateur.getAdmin() + ");");

    }

    @Override
    public void updateUtilisateur(Utilisateur utilisateur) throws SQLException {

    }

    @Override
    public void deleteUtilisateur(Utilisateur utilisateur) throws SQLException {

    }
}
