import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        int inp = 0;
        int sum = 0;
        int count = 0;
        int oddCount = 0;
        int evenCount = 0;
        
        while (inp != -1) {
            inp = Integer.parseInt(reader.nextLine());
            if (inp != -1) {
                sum += inp;
                if (inp % 2 == 0) {
                    evenCount += 1;
                } else {
                    oddCount += 1;
                }
                count++;
            }
        }
        
        double avg = 1.0 * sum / count;
        
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + count);
        System.out.println("Average: " + avg);
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
}
