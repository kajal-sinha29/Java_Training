
package assignment.service;
import java.util.*;
import java.io.*;
import assignment.com.UserInput;


public class FileWriting {
         
    String Headers = "YEAR,COUNTRY,STATE,CITY,ITEM,PROFIT\n";
    
    public void writeFile(ArrayList<ArrayList<String>> listOfRecords, String destFile){       
      try{
         
          String data = "";
          FileWriter file = new FileWriter(destFile, true);   
          BufferedWriter bufferWriter = new BufferedWriter(file);     
          bufferWriter.write(Headers);
      
          for(ArrayList<String> object : listOfRecords){
              for(String record: object){ 
                 data = record+",";
                 bufferWriter.write(data);
                }   
             bufferWriter.write("\n");          
           }
         bufferWriter.close();
        }
          catch(IOException e){
          e.printStackTrace();
          System.out.println("File can not be created");
      }
      
   }

}