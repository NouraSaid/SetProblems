import java.util.*; 

public class  RemoveElementFromSet {
    public static void main(String[] args) {


    
         Set<Integer> set1= new HashSet<Integer>(); 
        set1.addAll(Arrays.asList(1,2,3)); //add numbers
        System.out.println("\nSet1: " + set1); //print elements set1
        
        set1.remove(3);

        System.out.println("\nSet after removing number 3" + set1);
    }
}