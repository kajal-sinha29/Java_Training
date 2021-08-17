
package assignment.com;
import assignment.service.*;
import assignment.service.FileWriting;
import java.util.*;
import java.util.regex.Pattern;

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
              
        Collections.sort(listOfRecords, (ArrayList<String> first, ArrayList<String> second) -> {
            int compare;
            compare = first.get(0).compareTo(second.get(0));
            if (compare == 0)
                compare = first.get(1).compareTo(second.get(1));
            if (compare == 0)
                compare = first.get(5).compareTo(second.get(5));
            return compare;
        });
              String destFile = userInput.inputDestinationFile();
              FileWriting writer = new FileWriting();
              writer.writeFile(readerFirst.getListOfElements(), destFile);                         
    }
}
