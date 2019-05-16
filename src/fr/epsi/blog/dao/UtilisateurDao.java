package fr.epsi.blog.dao;

import fr.epsi.blog.beans.Utilisateur;

import java.sql.Connection;
import java.sql.PreparedStatement;
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

        String requete = "INSERT INTO user(nom, email, password, dateCreation, admin) VALUES(?,?,?,?,?);";
        PreparedStatement preparedStatement = connection.prepareStatement(requete);
        preparedStatement.setString(1, utilisateur.getNom());
        preparedStatement.setString(2, utilisateur.getEmail());
        preparedStatement.setString(3, utilisateur.getPassword());
        preparedStatement.setDate(4, utilisateur.getDateCreation());
        preparedStatement.setBoolean(5, utilisateur.getAdmin());

        preparedStatement.executeUpdate();

    }

    @Override
    public void updateUtilisateur(Utilisateur utilisateur) throws SQLException {

    }

    @Override
    public void deleteUtilisateur(Utilisateur utilisateur) throws SQLException {

    }
}
