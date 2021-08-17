
package bookmanagementsystem.service;
import java.util.*;

public class BookIssue {
    
   String issueDate, returnDate;
   int studentId, bookId;

   Scanner input = new Scanner(System.in);
   
   public List<Object> issueBook(){
     
     System.out.println("Enter issue Date");
     issueDate = input.next();
     System.out.println("Enter return Date");
     returnDate = input.next();
     System.out.println("Enter Student id");
     studentId = input.nextInt();
     System.out.println("Enter Book id");
     bookId = input.nextInt();
     
     return Arrays.asList(issueDate, returnDate, studentId, bookId);
 }
   
   
}
