
package bookmanagementsystem.com;
import bookmanagementsystem.service.*;
import bookmanagementsystem.utility.*;
import java.sql.*;
import java.util.*;

public class OperationsOnRecords {
    
    Scanner input = new Scanner(System.in);
    
    public void operations(Connection conn){

        int operation=1;
        InputReader inputReader = new InputReader();               
        RecordInserter insert = new RecordInserter();        
        RecordSearcher searchStudent = new RecordSearcher();       
        RecordPrinter print = new RecordPrinter();       
        BookIssue issue = new BookIssue();
                
        while(operation != 8){
            
        System.out.println("Enter 1 to Input Book Details");
        System.out.println("Enter 2 to Register Student");
        System.out.println("Enter 3 to Issue any Book");
        System.out.println("Enter 4 to Check student having books more then 15 days");
        System.out.println("Enter 5 to Search student with assigned books");       
        System.out.println("Enter 6 to Delete Book");
        System.out.println("Enter 7 to Update Book Details");
        System.out.println("Enter 8 to Exit");
        
        operation = input.nextInt();
            
        switch(operation){
        
            case 1: 
               List<Object> bookRecord = inputReader.insertBookDetails(); 
               insert.insertBookToDatabase(conn,bookRecord);
               System.out.println("hello");
               break;
                              
            case 2: 
                List<Object> studentRecord = inputReader.insertStudentDetails();
                insert.insertStudentToDatabase(conn,studentRecord);
                break;
                
            case 3:
                List<Object> bookIssueRecord = issue.issueBook();
                insert.insertIssueBookToDatabase(conn, bookIssueRecord);
                break;
                
            case 4:
                 print.printRecord(conn);
                 break;
                 
            case 5:
                searchStudent.searchStudent(conn);
                break;
                
            case 6:
                RecordDeleter deleteBook = new RecordDeleter();
                deleteBook.deleteBook(conn);
                break;
                
            case 7:
                RecordUpdater updateBook = new RecordUpdater();
                List<Object> updateRecord = inputReader.insertBookDetails();                 
                updateBook.updateBook(conn, updateRecord);
                break;
                
            case 8:
                System.exit(operation);
                
        }
        
      }
    } 
}
