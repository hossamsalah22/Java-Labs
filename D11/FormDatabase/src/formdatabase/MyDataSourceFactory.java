package formdatabase;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import javax.sql.DataSource;

public class MyDataSourceFactory {

    public static DataSource getMySQLDataSource() {
        Properties prop = new Properties();
        FileInputStream file = null;
        MysqlDataSource mysqlDS = null;

        try {
            file = new FileInputStream("connection.properties");
            prop.load(file);
            mysqlDS = new MysqlDataSource();
            mysqlDS.setURL("jdbc:mysql://localhost:3306/javatest");
            mysqlDS.setUser("root");
            mysqlDS.setPassword(""); 
           
        } catch (IOException io) {
            io.printStackTrace();
        }
        return  mysqlDS;
    }
}
