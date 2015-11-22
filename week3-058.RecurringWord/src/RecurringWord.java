
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String word;
        
        while(true) {
            System.out.print("Type a word: ");
            word = reader.nextLine();
            if (words.contains(word)) {
                break;
            }
            words.add(word);
        }
        
        System.out.println("You gave the word " + word + " twice");
        
        
    }
}
