
package assignment.service;
import assignment.com.Logs;
import assignment.utilility.ConversionRate;
import java.util.*;
import java.io.*;
import java.util.regex.*;
import java.text.DecimalFormat;

public class FileReading implements Runnable{
           
    ConversionRate conversionRate = new ConversionRate();    
    ArrayList<String> listOfRecords;
    ArrayList<ArrayList<String>> listOfElements = new ArrayList<>();
    
    String[] element;
    String record="";
    int counter;   
    Double profit;

    String sourceFile;
    Pattern alphaPattern;
    Pattern numericPattern;
    
    public FileReading(String sourceFile, Pattern alphaPattern, Pattern numericPattern) {
          this.sourceFile = sourceFile;
          this.alphaPattern = alphaPattern;
          this.numericPattern = numericPattern;
    }

    public void setListOfElements(ArrayList<ArrayList<String>> listOfElements) {
        this.listOfElements = listOfElements;
    }
        
    @Override
    public void run(){
            
      try{          
      
      FileWriter file = new FileWriter("D:\\Assignment\\error.txt", true);   
      BufferedWriter bufferWriter = new BufferedWriter(file);
      FileReader fileReader = new FileReader(sourceFile);   
      BufferedReader bufferReader = new BufferedReader(fileReader);
            
      counter = 0;      
      while ((record = bufferReader.readLine()) != null) { 
        counter++;   
        element = record.split("\\|");
        
        if(element.length != 6){
          Logs.printLogs("The data elements are not same on LINE NO : "+counter); 
          bufferWriter.write(record);
          bufferWriter.write("\n");
          continue;  
        }
        
        if(!numericPattern.matcher(element[3] + element[5]).matches() || 
           !alphaPattern.matcher(element[0] + element[1] + element[2] + element[4]).matches()){
           Logs.printLogs("Invalid Data at LINE NO : "+counter);  
           bufferWriter.write(record);
           bufferWriter.write("\n");
           continue;
        }
      
        profit = conversionRate.convertRupeesToDollar(Float.parseFloat(element[3]));
        double roundOff = Math.round(profit * 100.0) / 100.0;
        DecimalFormat df = new DecimalFormat("0000.00");
        String formatted = df.format(roundOff);
        System.out.println(formatted);
        element[3] = formatted;
 
        element[0] = element[0].toUpperCase();
                             
        String temp = element[0];
        element[0] = element[5];
        element[5] = element[3];
        element[3] = element[2];
        element[2] = element[1];
        element[1] = temp;
             
        listOfRecords = new ArrayList<>();
        Collections.addAll(listOfRecords, element);
        listOfElements.add(listOfRecords); 
         
        } 
      bufferWriter.close();
      
      } catch(FileNotFoundException e){
        e.printStackTrace();
        Logs.printLogs("File not found");  
      }
      
        catch(IOException e){
        e.printStackTrace();        
        Logs.printLogs("File can not be created");
      }
    }
      public ArrayList<ArrayList<String>> getListOfElements() {
        return listOfElements;
    }
}