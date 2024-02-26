import java.util.*; 
  
public class PrintSetUsingLoop { 
    public static void main(String args[]) 
    { 

        Set<String> set = new HashSet<String>(); // Creating an empty Set 
  
        // Use add() method to add elements into the Set 
        set.add("Apple"); 
        set.add("Banana"); 
        set.add("Cherry"); 
         
  
        for (String fruit : set) {
            System.out.println(fruit);} // print using loop
        
      
    } 
}