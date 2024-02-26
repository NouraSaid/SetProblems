  
import java.util.*; 
  
public class CheckforJohn { 
    public static void main(String args[]) 
    { 

        Set<String> set = new HashSet<String>(); // Creating an empty Set 
  
        // Use add() method to add elements into the Set 
        set.add("John"); 
        set.add("Noura"); 
        set.add("SAID"); 
        set.add("MOHAMMED"); 
        set.add("ALSAIDI"); 
       
       
        // Check if "John" is present in the Set
        if (set.contains("John")) {
            System.out.println("Found John"); 
        } else {
            System.out.println("John is not in the Set"); // If not
        }
    }
}