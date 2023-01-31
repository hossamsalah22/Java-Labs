/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hossa
 */
public class DataBaseApp {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/javatest";
        String username = "root";
        String password = "";
        try {
            // TODO code application logic here
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection connection = DriverManager.getConnection(url, username, password)) {
                Statement statement = connection.createStatement();
//              Add User
                String addUser = "INSERT INTO users (id, name, email, age, created_at, updated_at) VALUES (35, 'Hossam', 'Hossam@gmail.com', 26, current_timestamp(), current_timestamp())";
                statement.executeUpdate(addUser);
//              Update User
                String updateUser = "UPDATE users SET name = 'Mohsen', email = 'ali@gmail.com' where id = 6";
                statement.executeUpdate(updateUser);
//              Delete User
                String deleteUser = "DELETE FROM users WHERE id = 7";
                statement.executeUpdate(deleteUser);
                ResultSet resultSet = statement.executeQuery("select id, name, email, age from users");
                while(resultSet.next()) {
                    System.out.println(resultSet.getInt(1) + ":" + resultSet.getString(2) + ":" + resultSet.getString(3) + ":" + resultSet.getInt(4));
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataBaseApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
