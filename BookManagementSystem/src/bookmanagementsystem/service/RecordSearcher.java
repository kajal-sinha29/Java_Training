
package bookmanagementsystem.service;
import java.sql.*;
import java.util.*;
public class RecordSearcher {
    
    int studentId;
    Scanner input = new Scanner(System.in);
    String querry;
    public void searchStudent(Connection con){
        
        try{
            System.out.println("Enter the student id");
            studentId = input.nextInt();
            
            querry =  "select * from student_details left join book_issue_details on student_details.student_id = book_issue_details.student_id join book_details on book_issue_details.book_id = book_details.book_id where student_details.student_id = ?";
            PreparedStatement statement=con.prepareStatement(querry);             
            statement.setInt(1,studentId);
            
            ResultSet resultSet = statement.executeQuery();
           
            while (resultSet.next()) {
            int studentId = resultSet.getInt("student_id");
            int studentRoll = resultSet.getInt("rollno");
            String studentName = resultSet.getString("name");
            String studentEmail = resultSet.getString("email");
            String studentClass = resultSet.getString("class");
            String studentMobileNo = resultSet.getString("mobileno");
            String bookName = resultSet.getString("bookname");
            
            System.out.println("studentId studentRoll studentEmail studentClass  studentMobileNo bookName");
            System.out.println("\n"+studentId+"      "+studentRoll+"       "+studentEmail+"    "+studentClass+"  "+studentMobileNo+"      "+bookName);
            System.out.println();
            }
             
        }catch(Exception e){
            
        }
                         
        
    }
}
