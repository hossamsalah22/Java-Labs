/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeesapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author hossa
 */
public class EmployeesApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String db = "jdbc:mysql://localhost:3306/javatest";
        String username = "root";
        String password = "";
        Connection conn = null;
        String query;
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        int []count;
        try{
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            conn = DriverManager.getConnection(db,username,password);
            System.out.println("Connected");
//            query = "CREATE TABLE `javatest`.`employees` (`id` INT NOT NULL AUTO_INCREMENT , `first_name` VARCHAR(255) NOT NULL ,"
//                    + " `last_name` VARCHAR(255) NOT NULL ,"
//                    + " `gender` VARCHAR(255) NOT NULL, `age` INT NOT NULL DEFAULT '25',"
//                    + " `address` VARCHAR(255) NOT NULL , `phone_number` VARCHAR(255) NOT NULL ,"
//                    + " `vacation_balance` INT NOT NULL DEFAULT '30' , PRIMARY KEY (`id`)) ENGINE = InnoDB;";
//            preparedStatement = conn.prepareStatement(query);
//            preparedStatement.executeUpdate();
//            
//            query = "INSERT IGNORE INTO employees (first_name, last_name, gender, age, address, phone_number,vacation_balance) "
//                    + "VALUES (?,?,?,?,?,?,?)";
//            preparedStatement = conn.prepareStatement(query);
            conn.setAutoCommit(false);
//                // 1
//                preparedStatement.setString(1, "Hossam"); preparedStatement.setString(2, "Salah"); preparedStatement.setString(3, "M");
//                preparedStatement.setInt(4, 2023-1996); preparedStatement.setString(5, "New Damietta"); preparedStatement.setString(6, "01012512599");
//                preparedStatement.setInt(7, 30); 
//                preparedStatement.addBatch();
//                
//                preparedStatement.setString(1, "Mohammed"); preparedStatement.setString(2, "Salah"); preparedStatement.setString(3, "M");
//                preparedStatement.setInt(4, 2023-1994); preparedStatement.setString(5, "New Damietta"); preparedStatement.setString(6, "01012512599");
//                preparedStatement.setInt(7, 30); 
//                preparedStatement.addBatch();
//                
//                preparedStatement.setString(1, "Mahmoud"); preparedStatement.setString(2, "Ali"); preparedStatement.setString(3, "M");
//                preparedStatement.setInt(4, 2023-1996); preparedStatement.setString(5, "New Mansoura"); preparedStatement.setString(6, "01012512599");
//                preparedStatement.setInt(7, 30); 
//                preparedStatement.addBatch();
//                
//                preparedStatement.setString(1, "Rmay"); preparedStatement.setString(2, "Saber"); preparedStatement.setString(3, "M");
//                preparedStatement.setInt(4, 2023-1954); preparedStatement.setString(5, "Mansoura"); preparedStatement.setString(6, "01012512599");
//                preparedStatement.setInt(7, 30); 
//                preparedStatement.addBatch();
//                
//                preparedStatement.setString(1, "Eman"); preparedStatement.setString(2, "Salah"); preparedStatement.setString(3, "F");
//                preparedStatement.setInt(4, 2023-1958); preparedStatement.setString(5, "New Damietta"); preparedStatement.setString(6, "01012512599");
//                preparedStatement.setInt(7, 30); 
//                preparedStatement.addBatch();
//                
//                preparedStatement.setString(1, "mai"); preparedStatement.setString(2, "ramy"); preparedStatement.setString(3, "F");
//                preparedStatement.setInt(4, 2023-1999); preparedStatement.setString(5, "cairo"); preparedStatement.setString(6, "01012512599");
//                preparedStatement.setInt(7, 30); 
//                preparedStatement.addBatch();
//
//            preparedStatement.executeBatch();
//            query = "SELECT id, first_name, last_name, gender, age, address, vacation_balance FROM employees";
//            preparedStatement = conn.prepareStatement(query);
//            
//            resultSet = preparedStatement.executeQuery();
//            while(resultSet.next()){
//                System.out.println(resultSet.getInt(1)+":"+resultSet.getString(2)+":"+resultSet.getString(3)
//                +":"+resultSet.getString(4)+":"+resultSet.getString(5)+":"+resultSet.getString(6)
//                +":"+resultSet.getString(7));
//            }
//            conn.commit();
//            
            Statement stmt = conn.createStatement();
            query = "UPDATE employees SET vacation_balance = 45 WHERE age>=45";
            stmt.addBatch(query);
            query = "UPDATE employees SET first_name = CONCAT('MR/',first_name) WHERE gender='M' AND age>=45";
            stmt.addBatch(query);
            query = "UPDATE employees SET first_name = CONCAT('MRS/',first_name) WHERE gender='F' AND age>=45";
            stmt.addBatch(query);
//            
//            stmt.executeBatch();
//            conn.commit();
        }catch (SQLException e ){
            e.printStackTrace();

        }

    }
    
}
