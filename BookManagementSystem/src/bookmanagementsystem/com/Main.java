
package bookmanagementsystem.com;
import bookmanagementsystem.service.*;
import bookmanagementsystem.utility.*;
import java.sql.*;
import java.util.List;

public class Main {
    
    public static void main(String args[]){
        
        DatabaseConnector connector = new DatabaseConnector("bookmanagementsystem", "postgres", "admin");
        connector.connectToDatabase();
        Connection conn = connector.getConnection();
        
        OperationsOnRecords operation = new OperationsOnRecords();
        operation.operations(conn);
    }
}
