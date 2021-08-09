
package assignment.com;
import java.util.*;

public class UserInput {
    
    Scanner input = new Scanner(System.in);
    
    public String inputDestinationFile(){
        System.out.println("Enter the path for Destination File");
        String destination = input.next();
        
        return destination;
    }
    
    public String inputSourceFile(){
        System.out.println("Enter the path for Source File");
        String source = input.next();
        
        return source;
    }
    
    
    
    
    
    
}
