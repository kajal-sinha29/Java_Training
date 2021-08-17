
package bookmanagementsystem.service;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;

public class RecordPrinter {
    
    String querry;
    public void printRecord(Connection con){       
        try{

            Statement stmt = con.createStatement();
            ResultSet resultSet = stmt.executeQuery("select * from student_details left join book_issue_details on student_details.student_id = book_issue_details.student_id");
                                    
            while (resultSet.next()) {
            int studentId = resultSet.getInt("student_id");
            int studentRoll = resultSet.getInt("rollno");
            String studentName = resultSet.getString("name");
            String studentEmail = resultSet.getString("email");
            String studentClass = resultSet.getString("class");
            String studentMobileNo = resultSet.getString("mobileno");
            System.out.println("\n"+studentId+"   "+studentRoll+"    "+studentEmail+"  "+studentClass+"  "+studentMobileNo);
         }
           
        }
          catch(SQLException e){
              e.printStackTrace();
              System.out.println("Class not found");
          }
        
    }
    
}
