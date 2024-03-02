import java.util.Arrays;

public class RunningSumofArray {
    public static void main(String[] args) {
        
        // Input array
        int[] ArrayInput = {1, 2, 3, 4};
        
        // Initialize a variable
        int sum = 0;
        
        // Create an array to store the running sum
        int[] ArrayOutput = new int[ArrayInput.length];
        
        // Iterate through the array
        for (int i = 0; i <= ArrayInput.length - 1; i++) {
            // Add the current element to the running sum
            sum = sum + ArrayInput[i];
            
            // Assign the current running sum to the output array
            ArrayOutput[i] = sum; 
        }
        
        // Print the input array and the corresponding running sum
        System.out.println("INPUT ARRAY  = {1, 2, 3, 4}, RUNNING SUM OF THE ARRAY = " + Arrays.toString(ArrayOutput));
    }
}