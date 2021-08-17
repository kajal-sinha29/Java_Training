
package bookmanagementsystem.service;
import java.sql.*;
import java.util.*;

public class RecordDeleter {
    
    String bookName, querry;    
    Scanner input = new Scanner(System.in);
    
    public void deleteBook(Connection con){
        
        System.out.println("Enter the name of book you want to delete");
        bookName = input.next();
        
        try{
            querry = "delete from book_details where bookname = ?";
            PreparedStatement statement=con.prepareStatement(querry);           
            statement.setString(1,"bookName");
            statement.executeUpdate();
            System.out.println("Deleted");
        }
        catch(Exception e){
            
        }
        
        
    }
}
