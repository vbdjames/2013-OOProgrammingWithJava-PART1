
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        String val = "";
        int i = text.length();
        while (i > 0) {
            val += text.charAt(i-1);
            i--;
        }
        return val;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
