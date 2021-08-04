
package collection.arraylist;
import java.util.*;
import collection.arraylist.Student;
import collection.arraylist.ArrayListCreator;
import collection.arraylist.ArrayListPrinter;
import collection.arraylist.Student;

public class MainClass {
    
    public static void main(String args[]){
        //System.out.println("kajal");
        //Student record = new Student();
        ArrayListCreator list = new ArrayListCreator();
        ArrayListPrinter print = new ArrayListPrinter();
        ArrayListSorting sorting = new ArrayListSorting();
         //ArrayList<Integer> numbers = list.createNumbers();
        //print.displayNumbers(numbers);
        //sorting.sortNumbers(numbers);
        //print.displayNumbers(numbers);
        //sorting.sortNumbersInReverse(numbers);
        //print.displayNumbers(numbers);
        ArrayList<Student> studentInfo = list.createStudent();
        print.displayStudentData(studentInfo);
        //sorting.compare();
    }
}
