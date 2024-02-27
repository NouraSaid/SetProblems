import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;

public class CheckDisjointSets {
    public static void main(String[] args) {
        
        HashSet<String> set1 = new HashSet<>(); //1 Set
        HashSet<String> set2 = new HashSet<>(); // 2 Set
       
        
        //add elements for each Sets
        set1.addAll(Arrays.asList("NOURA","SAID","MOHAMMED")); 
        System.out.println("\nSet1: " + set1);
        set2.addAll(Arrays.asList("Abdullah","AFNAN","TAYBA"));
        System.out.println("\nSet1: " + set2);
        

        
      // Check if the sets are disjoint
        HashSet<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        if (intersection.isEmpty()) {
            System.out.println("Disjoint");
        } else {
            System.out.println("Not Disjoint");
        }
    }
}