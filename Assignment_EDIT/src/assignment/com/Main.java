
package assignment.com;
import assignment.service.FileWriting;
import assignment.service.FileReading;
import assignment.service.FileValidator;
import java.util.*;
import java.util.regex.Pattern;
import assignment.service.*;


public class Main{
    
    
    public static void main(String args[])throws Exception{
         
       UserInput userInput = new UserInput();
       String sourceFile = userInput.inputSourceFile(); 
       
       FileValidator validator = new FileValidator();
       Pattern alphaPattern = validator.alphaPattern();
       Pattern numericPattern = validator.numericPattern();
                       
              FileReading readerFirst = new FileReading(sourceFile,alphaPattern,numericPattern); 
              Thread threadFirst = new Thread(readerFirst);
              threadFirst.start();
              threadFirst.sleep(1000);
              ArrayList<ArrayList<String>> listOfRecords = readerFirst.getListOfElements();
              
        Collections.sort(listOfRecords, new Comparator<ArrayList<String>>() {
        public int compare(ArrayList<String> one, ArrayList<String> two) {
            
        int c;
        c = one.get(0).compareTo(two.get(0));
        if (c == 0)
        c = one.get(1).compareTo(two.get(1));
        if (c == 0)
        c = one.get(5).compareTo(two.get(5));
        return c;
        
       }
   });
              String destFile = userInput.inputDestinationFile();
              FileWriting writer = new FileWriting();
              writer.writeFile(readerFirst.getListOfElements(), destFile);                         
    }
}
