import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;

public class CombineMultipleSets {
    public static void main(String[] args) {
        
        Set<Integer> set1 = new HashSet<>(); //1 Set
        Set<Integer> set2 = new HashSet<>(); // 2 Set
        Set<Integer> set3 = new HashSet<>(); // 3 Set
        
        //add elements for each Sets
        set1.addAll(Arrays.asList(10,20,30,40,50)); 
        set2.addAll(Arrays.asList(40,50,60,70,80));
        set3.addAll(Arrays.asList(90,100,200,300,400));

        
        Set<Integer> combinedSet = new HashSet<>();
        combinedSet.addAll(set1);
        combinedSet.addAll(set2);
        combinedSet.addAll(set3);

        // Print the union of the sets
        System.out.println("Union of sets: " + combinedSet);
    }
}