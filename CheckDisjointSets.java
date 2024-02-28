import java.util.HashSet;
import java.util.Arrays;
import java.util.Collections;

public class CheckDisjointSets {
    public static void main(String[] args) {
        
        HashSet<String> set1 = new HashSet<>(); // Set 1
        HashSet<String> set2 = new HashSet<>(); // Set 2
       
        // Add elements for each Sets
        set1.addAll(Arrays.asList("NOURA", "SAID", "MOHAMMED")); 
        System.out.println("Set1: " + set1);
        
        set2.addAll(Arrays.asList("Abdullah", "AFNAN", "TAYBA", "NOURA"));
        System.out.println("Set2: " + set2);

        // Check if the sets are disjoint using Collections.disjoint()
        if (Collections.disjoint(set1, set2)) {
            System.out.println("Disjoint");
        } else {
            System.out.println("Not Disjoint");
        }
    }
}
