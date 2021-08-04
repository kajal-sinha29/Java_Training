
package collection.arraylist;

import java.util.ArrayList;
import collection.arraylist.Student;

public class ArrayListPrinter {
    
    public void displayNumbers(ArrayList numbers){
       
        for(Object  element:numbers){
            System.out.println((Integer)element);
        }
    }
    
    public void displayStudentData(ArrayList data){
        
        for(Object  element:data){
            System.out.println((Student)element);
        }
    }
}
