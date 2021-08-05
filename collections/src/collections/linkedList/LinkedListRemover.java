
package collections.linkedList;
import java.util.*;
//import collections.linkedList.

public class LinkedListRemover {
    
    int elementIndex;
    
    LinkedListRemover(int elementIndex){
    
    this.elementIndex = elementIndex;
}
    public LinkedList<String> removeElements(LinkedList list){
        
        list.remove(elementIndex);
        return list;
    }
    
}
