
package collections.linkedList;

import java.util.LinkedList;
import java.util.List;

public class SubListOfLinkedList {
    
    int firstIndex, lastIndex;
    
    SubListOfLinkedList(int firstIndex, int secondIndex){
        this.lastIndex = secondIndex;
        this.firstIndex = firstIndex;
    }
    
    public LinkedList<String> fetchSubListOfLinkedList(LinkedList list){
        
        List sublist = list.subList(firstIndex, lastIndex);
              
       return list;
    }
}
