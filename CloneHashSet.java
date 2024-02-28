import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;
  
public class CloneHashSet { 
    public static void main(String args[]) 
    { 

        Set<String> set = new HashSet<String>(); // Creating an empty Set 
  
        // Use add() method to add elements into the Set 
        set.addAll(Arrays.asList("Apple","Banana","Cherry")); 
        
        
         HashSet<String> copiedSet = new HashSet<>(set);
    
        // Add a new element to the copied set
        copiedSet.add("Noura");

        // Print both sets
        System.out.println("First Set: " + set);
        System.out.println("\nCopied Set  : " + copiedSet);
    
}}