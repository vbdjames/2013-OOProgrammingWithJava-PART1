import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String word;
        
        while(true) {
            System.out.print("Type a word: ");
            word = reader.nextLine();
            if (word.isEmpty()) {
                break;
            }
            words.add(word);
        }
        
        Collections.reverse(words);
        
        System.out.println("You typed the following words:");
        int i = 0;
        while(i < words.size()) {
            System.out.println(words.get(i));
            i++;
        }

    }
}
