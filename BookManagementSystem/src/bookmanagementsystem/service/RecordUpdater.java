
package bookmanagementsystem.service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.*;

public class RecordUpdater {
    int bookId;
    Scanner input = new Scanner(System.in);
    String querry;
    
    public void updateBook(Connection con, List<Object> records){
       
        System.out.println("Enter the book id you want to update");
        bookId = input.nextInt();
        
        try{
            querry = "UPDATE book_details SET bookname = ?, author = ?, subject = ?, no_of_copies = ?, publish_date = ? WHERE book_id = ?";
            PreparedStatement statement=con.prepareStatement(querry);
                         
            statement.setString(1, (String) records.get(1));
            statement.setString(2, (String) records.get(2));
            statement.setString(3, (String) records.get(3));
            statement.setInt(4, (int) records.get(4));
            statement.setString(5, (String) records.get(5));
            statement.setInt(6, bookId);
                       
            statement.executeUpdate();  
            System.out.println("Record updated !!");
            
        }
           catch(Exception e){
               e.printStackTrace();
           }

    }
    
    public void updateStudent(){
        
    }
}
