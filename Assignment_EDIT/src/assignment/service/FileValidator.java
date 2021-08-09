
package assignment.service;
import java.util.regex.*;

public class FileValidator {
    
    public Pattern stringPattern(String fileRows){
        
          Pattern stringRegex = Pattern.compile("^[a-zA-Z]+$");
          return stringRegex;
    }
    
    public Pattern numericPattern(){
        
        Pattern numericRegex = Pattern.compile("^[0-9]+$");
        return numericRegex;
    }
    
    public Pattern alphaPattern(){
        
        Pattern alphaRegex = Pattern.compile("^[a-zA-Z]+$");
        return alphaRegex;
    }
    
    
    
}
