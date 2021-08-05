
package collections.linkedList;
import java.util.*;


public class LinkedListElementAdder {
    
    int indexOfElement;
    String value;
    
    LinkedListElementAdder(){
        
    }
    
    LinkedListElementAdder(int indexOfElement, String value){
        this.value = value;
        this.indexOfElement = indexOfElement;
    }
    
    public LinkedList<String> addElements(LinkedList list){
        
       list.add("kajal");
       list.add("sinha");
       list.add("Shubham");
       list.add("Amit");
       
       return list;
    }
    
    public LinkedList<String> addElementWithIndexValue(LinkedList list){
        
       list.add(indexOfElement, value);
       
       
       return list;
    }
    
    public LinkedList<String> replaceElement(LinkedList list){
        
       list.set(indexOfElement, value);
       
       
       return list;
    }
    
}
