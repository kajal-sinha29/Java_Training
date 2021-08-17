
package bookmanagementsystem.utility;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputReader {
    
    Scanner input = new Scanner(System.in);
    String bookname, author, subject;;
    int book_id, noOfCopies;
    String publishDate;
    
    int studentId, rollno;
    String studentName, email, studentClass, mobileno;
    
   
       
    public List<Object> insertBookDetails(){
        
      System.out.println("Enter the book_id");
      book_id=input.nextInt();
      System.out.println("Enter the bookname");
      bookname=input.next();
      System.out.println("Enter the author");
      author=input.next();
      System.out.println("Enter the subject");
      subject=input.next();
      System.out.println("Enter the noOfCopies");
      noOfCopies=input.nextInt();
      System.out.println("Enter the publishDate");
      publishDate=input.next();

      
      return Arrays.asList(book_id, bookname, author, subject, noOfCopies, publishDate );
      
    }
    
    
    public List<Object> insertStudentDetails(){
        
      System.out.println("Enter the student_id");
      studentId=input.nextInt();
      System.out.println("Enter the rollno");
      rollno=input.nextInt();
      System.out.println("Enter the Student Name");
      studentName=input.next();
      System.out.println("Enter the email");
      email=input.next();
      System.out.println("Enter the student class");
      studentClass=input.next();
      System.out.println("Enter the mobile no");
      mobileno=input.next();

      
      return Arrays.asList(studentId, rollno, studentName, email, studentClass, mobileno );
      
    }
}
 
