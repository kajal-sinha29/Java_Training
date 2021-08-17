
package bookmanagementsystem.com;
import java.sql.*;

public class DatabaseConnector {
    
    String url;
    Connection connection;
    
    String database; String username; String password;

    public DatabaseConnector(String database, String username, String password) {
        this.database = database;
        this.username = username;
        this.password = password;
    }
    
    public void connectToDatabase() {
        String url = "jdbc:postgresql:" + database;

        try {
            Class.forName("org.postgresql.Driver");               
             connection = DriverManager.getConnection(url, username, password);
            //return conn;
            //connection.close();
        } catch (SQLException e) {
        }
        catch (ClassNotFoundException e) {
        }
        //return connection;   
        
    }   

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }


    
}
