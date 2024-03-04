import java.util.Scanner;

public class PalindromeCheck {
    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Convert the string to lowercase
        str = str.toLowerCase();

        // Initializing an empty string to store the reverse of the original str
        String rev = "";

        // Iterate through the string in reverse order and build the reversed string
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        // Check if the original and reversed strings are equal
        return str.equals(rev);
    }

    public static void main(String[] args) {
        // Input string
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        // Check if the input string is a palindrome
        boolean isPal = isPalindrome(inputString);

        // Display the result
        if (isPal) {
            System.out.println("The entered string is a palindrome.");
        } else {
            System.out.println("The entered string is not a palindrome.");
        }
    }}