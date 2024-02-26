// Calculate the Size of a Set
  
import java.util.*; 
  
public class CalculateSizeSet { 
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
  
        System.out.println("The size of the set is: " + set.size()); //print size of the set using size() method
    } 
} 