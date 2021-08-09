import java.util.*;
public class Practice {
  public static void main(String[] args) throws Exception { 
   ArrayList<ArrayList<String>> list= new ArrayList<ArrayList<String>>();
   ArrayList<String> list1 = new ArrayList<String>();
   ArrayList<String> list2 = new ArrayList<String>();
   ArrayList<String> list3 = new ArrayList<String>();

   list1.add("US");
   list1.add("Bihta");
   list1.add("123");
   list1.add("2019");

   list.add(list1);
   
   list2.add("UK");
   list2.add("Bihar");
   list2.add("345");
   list2.add("2017");
   
   list.add(list2);

   
   list3.add("IND");
   list3.add("UP");
   list3.add("756");
   list3.add("2021");
   
   list.add(list3);

   Collections.sort(list, new Comparator<ArrayList<String>>() {
    @Override
    public int compare(ArrayList<String> one, ArrayList<String> two) {
        return one.get(0).compareTo(two.get(0));
    }
   });

   System.out.println(list);
  }  
}