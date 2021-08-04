
package collection.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import collection.arraylist.Student;
import java.util.Comparator;


public class ArrayListSorting implements Comparator<Student> {
    
    public ArrayList<Integer> sortNumbers(ArrayList numbers){
       
        System.out.println("Sorted ArrayList");
       Collections.sort(numbers);
       
       return numbers;
        }
    
    
        public ArrayList<Integer> sortNumbersInReverse(ArrayList numbers){
       
        System.out.println("Sorted in Reverse order ArrayList");
       Collections.sort(numbers,Collections.reverseOrder());
       return numbers;
      }
    
      
        
      
          
     public int compare(Student a, Student b)
    {
        return a.studentName.compareTo(b.studentName);
    }
     
   
      
      
      
      
      
      
}
            
            
            
  

