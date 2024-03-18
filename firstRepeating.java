// First Recurring Character
import java.util.HashSet;
import java.util.Set;
public class FirstRepeating{
    public static void main(String[] args) {

        String inputChar = "balloon"; // input Character

        Set<Character> charSet = new HashSet<>(); //add set to store string
        boolean isFound = false;

        for (int i = 0; i < inputChar.length(); i++) {
            char currentChar = inputChar.charAt(i);

            if (charSet.contains(currentChar)) // use contains method to check the elements //
                 {
                System.out.println(currentChar + " is the first character that occurs more than one time."); //print the first repeating element
                isFound = true;
                break; // break the loop if first repeating elements was found
            } else {
                charSet.add(currentChar); // if not found add elements to the set
            }
        }

        if (!isFound) {
            System.out.println("No repeating characters found."); // if there is no repeating elements print this massage
    }
} }
