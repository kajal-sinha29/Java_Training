
package collections.linkedList;

import java.util.LinkedList;


public class LinkedListPrinter {
    
    public LinkedList<String> printLinkedList(LinkedList list){
        

        for(Object element: list){
            System.out.println(element);
        }
        
        return list;
    }
    
}
