/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapplication;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
/**
 *
 * @author hossa
 */
public class JDBCConnection {
    public static void main(String[] args) {
        // TODO code application logic here
        Properties prop = new Properties();
        OutputStream output = null;
        try {
            output = new FileOutputStream("connection.properties");
            prop.setProperty("BD_URL", "jdbc:mysql://localhost:3306/javatest");
            prop.setProperty("BD_USERNAME", "root");
            prop.setProperty("BD_PASSWORD", "");
            prop.store(output, null);
        }catch(IOException e) {
            e.printStackTrace();
        } finally {
            if(output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
