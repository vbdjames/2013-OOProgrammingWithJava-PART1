
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        // Write your code here
        while(true) {
            System.out.print("Type the password: ");
            String pword = reader.nextLine();
            if (pword.equals(password)) {
                System.out.println("Right!");
                System.out.println("");
                System.out.println("The secret is: noone cares");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }
        
        
        
    }
}
