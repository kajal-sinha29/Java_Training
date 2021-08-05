
package selfpractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class PhoneBook {
    
     Scanner readInput = new Scanner(System.in);    
 
     HashMap<String, Long> telephoneBook = new HashMap<>();
    
    public static void main(String args[]){
        
                
        HashMap<String, Long> phoneBook = new PhoneBook().userInput();
        new PhoneBook().printTelephoneBook(phoneBook);
        new PhoneBook().searchRecord(phoneBook);
        
    }
    
     public HashMap<String, Long> userInput(){
        System.out.println("Enter the number of record you want to store in the phone book");
        int noOfRecords = readInput.nextInt();
        
        for(int record=1; record<=noOfRecords; record++){
            
        System.out.println("Enter Name");
        String name = readInput.next();
        
        System.out.println("Enter phone number");
        Long phoneNumber = readInput.nextLong();
        
        telephoneBook.put(name, phoneNumber);
            
        }
        
        return telephoneBook;
    }
    
    public HashMap<String, Long> printTelephoneBook(HashMap hashMap){
        
        Set entrySet = hashMap.entrySet();
        Iterator<HashMap> record = entrySet.iterator();
         
        
        while(record.hasNext()) {
        System.out.println(record.next());
         }
        
        return hashMap;
    } 
    
    public HashMap<String, Long> searchRecord(HashMap hashMap){
        
        System.out.println("Enter the name you want to search");
        String name = readInput.next();
        
        if(hashMap.containsKey(name)){
            
            System.out.println(name+" = "+hashMap.get(name));
        }
        else{
            System.out.println("not found !!!");
        }
        return hashMap;
    }
}
