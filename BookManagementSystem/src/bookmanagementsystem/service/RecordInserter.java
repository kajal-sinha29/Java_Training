
package bookmanagementsystem.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;
public class RecordInserter {
    
    private Scanner input = new Scanner(System.in);
    private String querry;
    
    public void insertBookToDatabase(Connection con, List<Object> records){
        try{
            querry = "insert into book_details values(?,?,?,?,?,?)";
            PreparedStatement stmt=con.prepareStatement(querry); 
            stmt.setInt(1, (int) records.get(0));  
            stmt.setString(2, (String) records.get(1));
            stmt.setString(3, (String) records.get(2));
            stmt.setString(4, (String) records.get(3));
            stmt.setInt(5, (int) records.get(4));
            stmt.setString(6, (String) records.get(5));
            
                
                stmt.executeUpdate();  
                System.out.println("Record updated");
            }            
        
          catch(SQLException e){
              e.printStackTrace();
              System.out.println("Class not found");
          }
          catch(Exception e){
              e.printStackTrace();
              System.out.println("already exist");
          }
        
    }
       
     public void insertStudentToDatabase(Connection con, List<Object> records){
        try{
            querry = "insert into student_details values(?,?,?,?,?,?)";
            PreparedStatement stmt=con.prepareStatement(querry); 
            stmt.setInt(1, (int) records.get(0)); 
            stmt.setInt(2, (int) records.get(1));
            stmt.setString(3, (String) records.get(2));
            stmt.setString(4, (String) records.get(3));
            stmt.setString(5, (String) records.get(4));
            stmt.setString(6, (String) records.get(5));
                       
            stmt.executeUpdate();  
            System.out.println("Record updated");
        }
          catch(SQLException e){
              e.printStackTrace();
              System.out.println("Class not found");
          }
        
    }
     
     
     
     public void insertIssueBookToDatabase(Connection con, List<Object> records){
        try{
            querry = "insert into book_issue_details values(?,?,?,?)";
            PreparedStatement stmt=con.prepareStatement(querry); 

            stmt.setString(1, (String) records.get(0));
            stmt.setString(2, (String) records.get(1));
            stmt.setInt(3, (int) records.get(2)); 
            stmt.setInt(4, (int) records.get(3));
                       
            stmt.executeUpdate();  
            System.out.println("Record updated");
        }
          catch(SQLException e){
              e.printStackTrace();
              System.out.println("Class not found");
          }
        
    }
    
}
