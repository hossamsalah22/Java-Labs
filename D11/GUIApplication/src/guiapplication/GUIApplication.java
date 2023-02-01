/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapplication;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.sql.DataSource;

/**
 *
 * @author hossa
 */
public class GUIApplication extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        MainDocumentBase root = new MainDocumentBase();
        Scene scene = new Scene(root, 600, 400);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    
    public static void testData() {
        DataSource ds = null;
        ds = MyDataSourceFactory.getMySQLDataSource();
        Connection conn = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
           conn = ds.getConnection();
           statement = conn.createStatement();
           resultSet = statement.executeQuery("SELECT * FROM emps");
           while(resultSet.next()) {
               System.out.println(resultSet.getInt("id")+ ":" + resultSet.getString("first_name")+ ":" +
                       resultSet.getString("middle_name")+ ":" +
                       resultSet.getString("last_name") + ":" + 
                       resultSet.getString("email") + ":" +
                       resultSet.getInt("phone"));
           }
        } catch(SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if(resultSet != null) resultSet.close();
            if(statement != null) statement.close();
            if(conn != null) conn.close();
            }catch(SQLException e) {
            e.printStackTrace();
        }
        }
    }
    public static void main(String[] args) {
         testData();
        launch(args);
    }
    
}
