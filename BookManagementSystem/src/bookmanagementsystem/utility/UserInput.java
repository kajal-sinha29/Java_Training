
package bookmanagementsystem.utility;
import bookmanagementsystem.com.DatabaseConnector;
import java.sql.Connection;
import java.util.*;

public class UserInput {
    
    Scanner input = new Scanner(System.in);
    int operation;
    
    public int inputForOperations(){       
            
        System.out.println("Enter 1 to Input Book Details");
        System.out.println("Enter 2 to Register Student");
        System.out.println("Enter 3 to Issue any Book");
        System.out.println("Enter 4 to Check student having books more then 15 days");
        System.out.println("Enter 5 to Search student with assigned books");       
        System.out.println("Enter 6 to Delete Book");
        System.out.println("Enter 7 to Update Book Details");
        System.out.println("Enter 8 to Exit");
        
        operation = input.nextInt();
        
        return operation;
    }
    
    
    
}
