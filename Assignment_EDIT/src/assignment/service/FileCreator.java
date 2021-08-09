
package assignment.service;
import java.io.*;
import java.util.*;
import assignment.com.UserInput;

public class FileCreator {
    
    UserInput input = new UserInput();
    String destFile = input.inputDestinationFile();    
    
    public void createDestinationFile(){  
       try{
           File file = new File(destFile);
           file.createNewFile();
           
       }catch(Exception e){
           System.out.println("Can not create a file");
           e.printStackTrace();
       }
        
    }
    
}
    
    

