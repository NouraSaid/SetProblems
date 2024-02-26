  
import java.util.*; 
  
public class RemoveElementFromSet { 
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
        
        set.remove(14); 
  
      System.out.println("Set after removing elements: "
                           + set);  //print set after remove 
    } 
} 