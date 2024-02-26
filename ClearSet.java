// Clear all elements from a set
  
import java.util.*; 
  
public class ClearSet { 
    public static void main(String args[]) 
    { 

        Set<Integer> set = new HashSet<Integer>(); // Creating an empty Set 
  
        // Use add() method to add elements into the Set 
        set.add(12); 
        set.add(13); 
        set.add(14); 
        set.add(15); 
        set.add(16); 
  
        System.out.println("Set: " + set); //print out the set values
        
        set.clear(); 
  
      System.out.println("Set after clear : "
                           + set);  //print set after clear all elements using clear method 
    } 
} 