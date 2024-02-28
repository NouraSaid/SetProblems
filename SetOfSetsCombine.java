import java.util.HashSet;
import java.util.Arrays;
import java.util.Iterator;

public class SetOfSetsCombine {
    public static void main(String[] args) {
        // Create a HashSet of HashSet<Integer>
        HashSet<HashSet<Integer>> setOfSets = new HashSet<>();

        // Add several HashSet<Integer> objects to the setOfSets
        HashSet<Integer> set1 = new HashSet<>();
        set1.addAll(Arrays.asList(1,2,3)); //add numbers
        System.out.println("\nSet1: " + set1); //print elements set1
        

        HashSet<Integer> set2 = new HashSet<>(); 
        set2.addAll(Arrays.asList(4,5,6)); //add numbers
        System.out.println("\nSet2: " + set2); //print elements set2

        HashSet<Integer> set3 = new HashSet<>();
        set3.addAll(Arrays.asList(7,8,9)); //add numbers
        System.out.println("\nSet3: " + set3); //print elements


        setOfSets.add(set1);
        setOfSets.add(set2);
        setOfSets.add(set3);

        // Print all unique integers from all sets combined
        HashSet<Integer> combinedSet = new HashSet<>();
        for (HashSet<Integer> set : setOfSets) {
            combinedSet.addAll(set);
        }

        System.out.println("\nCombine all the different numbers from all sets: " + combinedSet);
    }
}