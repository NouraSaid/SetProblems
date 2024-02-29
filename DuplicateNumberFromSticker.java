import java.util.HashSet;

public class DuplicateNumberFromSticker {  
    public static void main(String[] args) {      
          
        // Initialize array with Sticker numbers  
        int[] StickerInput = new int[] {1, 2, 3, 4, 2, 7, 8, 8, 3};   
          
        System.out.println("Duplicate Numbers in given Stickers: ");  

        // HashSet to track seen elements
        HashSet<Integer> set = new HashSet<>();

        for (int num : StickerInput) {
            //  check If the number is in the HashSet, it's a duplicate using add() method 
            if (!set.add(num)) {
                System.out.println(num);
            }
        }
    
    }  
}