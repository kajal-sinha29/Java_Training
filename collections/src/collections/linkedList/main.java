
package collections.linkedList;
import java.util.*;


public class main {
    
    public static void main(String args[]){
        
        LinkedListCreator createList = new LinkedListCreator();
        LinkedList<String> list = createList.createLinkedList();
        
        LinkedListElementAdder adder = new LinkedListElementAdder(0, "India");
        LinkedList<String> elements = adder.addElementWithIndexValue(list);
        new LinkedListElementAdder(1, "Pakistan").addElementWithIndexValue(list);
        new LinkedListElementAdder(2, "China").addElementWithIndexValue(list);
        
        LinkedListPrinter printer = new LinkedListPrinter();
        printer.printLinkedList(elements);
        
        //LinkedListRemover remove = new LinkedListRemover(2);
        //remove.removeElements(elements);
        
        //System.out.println("After removing element");
        //reader.printLinkedList(elements);

        new LinkedListElementAdder(1, "Australia").replaceElement(elements);
        System.out.println("After replacing element");
        printer.printLinkedList(elements);
        
        new LinkedListSearching("kajal").searchElement(elements);
    }
}
