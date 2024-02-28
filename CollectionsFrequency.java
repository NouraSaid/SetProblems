import java.util.*;  
import java.util.HashSet;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsFrequency {  
    public static void main(String[] args) {  
                 
               
            List<Integer> numbers = Arrays.asList(1, 2, 2, 2, 3, 4, 5, 5, 6, 6, 6); //creat list and  add elements 

          System.out.println("List of elements: "+numbers);  //print all numbers in the list
          
          System.out.println("\nCount all Numbers with frequency:"); 
          
          Set<Integer> uniqueSet = new HashSet<Integer>(numbers);  // Use a HashSet to get unique elements
        
         for (Integer i : uniqueSet) {  
             System.out.println(i + " -----> " + Collections.frequency(numbers, i));  // Iterate through unique elements and print their frequency  
        }  
    }       
}