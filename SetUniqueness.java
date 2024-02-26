  
import java.util.*; 
  
public class  SetUniqueness { 
    public static void main(String args[]) 
    { 

        Set<Integer> set = new HashSet<Integer>(); // Creating an empty Set 
  
        // Use add() method to add elements into the Set 
        set.add(2); 
        set.add(4); 
        set.add(4); 
        set.add(5); 
        set.add(6); 
        set.add(6); 
       
       System.out.println("Set: " + set); //print out the set values
    }