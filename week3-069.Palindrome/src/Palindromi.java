import java.util.Scanner;

public class Palindromi {
    
    public static String reverse(String text) {
        String val = "";
        int i = text.length();
        while (i > 0) {
            val += text.charAt(i-1);
            i--;
        }
        return val;
    }

    public static boolean palindrome(String text) {
        System.out.println(text);
        System.out.println(reverse(text));
        if (text.equals(reverse(text))) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
