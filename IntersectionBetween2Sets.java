import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;

public class IntersectionBetween2Sets {
    public static void main(String[] args) {
        
        Set<Integer> set1 = new HashSet<>(); //firsr Set
        Set<Integer> set2 = new HashSet<>(); // second Set
        
        // Add elements to the first set
        
       /* set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);
        set1.add(50); */
        
        set1.addAll(Arrays.asList(10,20,30,40,50));
       

        // Add elements to the second set
       /* set2.add(40);
        set2.add(50);
        set2.add(60);
        set2.add(70);
        set2.add(80); */
        
        set2.addAll(Arrays.asList(40,50,60,70,80));

        
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2); // Find the intersection of the two sets using retaunAll() method

       
        System.out.println("Intersection of Set1 and Set2: " + intersection); //print the Intersection (commen numbers ) b/w the 2 sets 
    }
}