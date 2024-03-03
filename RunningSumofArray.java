mport java.util.Arrays;

public class RunningSumofArray {
    public static void main(String[] args) {

        // Input array
        int[] ArrayInput = {1, 2, 3, 4};

        // Initialize a variable
        int sum = 0;

        // Create an array to store the running sum
        int[] ArrayOutput = new int[ArrayInput.length];

        // Iterate through the array using enhanced for loop
        for (int num : ArrayInput) {
            // Add the current element to the running sum
            sum = sum + num;

            // Assign the current running sum to the output array
            ArrayOutput[num - 1] = sum; // Subtract 1 to get the correct index since array indices start from 0
        }

        // Print the input array and the corresponding running sum
        System.out.println("INPUT ARRAY  = " + Arrays.toString(ArrayInput) +
                           ", RUNNING SUM OF THE ARRAY = " + Arrays.toString(ArrayOutput));
    }
}
