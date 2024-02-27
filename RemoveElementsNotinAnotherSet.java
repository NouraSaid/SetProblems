import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;

public class RemoveElementsNotinAnotherSet {
    public static void main(String[] args) {
        
        Set<Integer> set1 = new HashSet<>(); //1 Set
        Set<Integer> set2 = new HashSet<>(); // 2 Set
       
        
        //add elements for each Sets
        set1.addAll(Arrays.asList(10,20,30,40,50)); 
        System.out.println("\nSet1: " + set1);
        set2.addAll(Arrays.asList(40,50,60,70,80));
        System.out.println("\nSet1: " + set2);
        

        
        // Remove elements from set1 that are not present in set2
        set1.retainAll(set2);

        // Print the modified set1
        System.out.println("\nModified set1: " + set1);

       
    }
}