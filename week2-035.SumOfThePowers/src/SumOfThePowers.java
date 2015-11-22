
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int i = Integer.parseInt(reader.nextLine());
        int result = 0;
        
        while (i >= 0) {
            result += (int)Math.pow(2,i);
            i --;
        }
        
        System.out.println("The result is " + result);
    }
}
