/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datasourcetest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.DataSource;

/**
 *
 * @author hossa
 */
public class DataSourceTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        testData();
    }
    
    public static void testData() {
        DataSource ds = null;
        ds = myDataSourceFactory.getMySQLDataSource();
        Connection conn = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
           conn = ds.getConnection();
           statement = conn.createStatement();
           resultSet = statement.executeQuery("SELECT * FROM users");
           while(resultSet.next()) {
               System.out.println(resultSet.getInt("id")+ ":" + resultSet.getString("name") + ":" + resultSet.getString("email") + ":" + resultSet.getInt("age"));
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
    
}
