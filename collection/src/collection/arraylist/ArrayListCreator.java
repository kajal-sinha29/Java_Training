
package collection.arraylist;
import collection.arraylist.Student;
import java.util.ArrayList;


public class ArrayListCreator {
    
     public ArrayList<Integer> createNumbers(){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(13);
        numbers.add(0);
        numbers.add(10);
        return numbers;
    }
    
     public ArrayList<Student> createStudent(){
        
         //Student data = new Student();
         
         ArrayList<Student> data = new ArrayList<Student>();
         
         data.add(new Student("Jhon",11, 11, 1234));
         data.add(new Student("Mike",12, 21, 5678));
         
         return data;
     }
}
