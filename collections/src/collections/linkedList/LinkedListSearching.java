
package collections.linkedList;
import java.util.*;

public class LinkedListSearching {
    
    String value;
    
    LinkedListSearching(String value){
        this.value = value;
    }
    
    
    public LinkedList<String> searchElement(LinkedList list){
                
        if (list.contains(value)) {
       System.out.println("Element "+value+" is present in List");
         } 
        else 
        
       {
       System.out.println("List doesn't have element "+value);
       }
                
       return list;
    }


    public LinkedList<String> fetchFirstElement(LinkedList list){
        
       list.getFirst();
       
       return list;
    }
    
     public LinkedList<String> fetchLastElement(LinkedList list){
        
       list.getLast();
              
       return list;
    }
    
      
     
}
