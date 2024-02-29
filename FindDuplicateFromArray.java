import java.util.HashSet;

public class FindDuplicateFromArray {
    
    public static int findDuplicate(int[] nums) {
        
        System.out.println("MY ARRAY : { 1, 3 , 4 , 3 , 3 }");
        HashSet<Integer> MyArray= new HashSet<>();
        
        // Found the duplicate using contains () method
        for (int number : nums) {
            if (MyArray.contains(number)) 
            {
                return number;  }
            MyArray.add(number); }  
            return -1; //if no dupulicate numbers
            }
                            
                            

    public static void main(String[] args) {
        int[] inputArray = {1, 3, 4, 3,3}; // Replace this array with your input

        int duplicateNumber = findDuplicate(inputArray);

        if (duplicateNumber != -1) {
            System.out.println("\nDuplicate numbers : " + duplicateNumber); //print duplucate numbers if found
        } else {
            System.out.println("\nNo duplicate numbers");
        }
    }
}