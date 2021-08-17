
package databases;
import java.sql.*;

public class Databases {
 
    public static void main(String[] args) throws Exception {
                
    Connection con = null;
      try {
         Class.forName("org.postgresql.Driver");
         con = DriverManager
            .getConnection("jdbc:postgresql://localhost:5432/employee",
            "postgres", "admin");
      } catch (Exception e) {
         e.printStackTrace();
         System.err.println(e.getClass().getName()+": "+e.getMessage());
         System.exit(0);
      }
      System.out.println("Opened database successfully");
      
      
      PreparedStatement stmt = con.prepareStatement("call insert_employeedetail(113, 'Jhonny', 'Devops', 4, '11-11-2016', 85647, 33, 3)");
      stmt.execute();
      System.out.println("Inserted");
    }
        
        
    }
