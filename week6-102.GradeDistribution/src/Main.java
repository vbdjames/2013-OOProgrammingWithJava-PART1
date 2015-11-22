
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        ArrayList<Integer> scores = collectScores(lukija);

        int[] gradeDist = calculateGrades(scores);
        
        double acceptancePercentage = calculateAcceptance(scores, gradeDist);

        printResults(gradeDist, acceptancePercentage);

    }

    private static void printResults(int[] gradeDist, double acceptancePercentage) {
        // print the results
        System.out.println("Grade distribution:");
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int j = 0; j < gradeDist[i]; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        System.out.println("Acceptance percentage: " + acceptancePercentage);
    }

    private static double calculateAcceptance(ArrayList<Integer> scores, int[] gradeDist) {
        // calculate the acceptance percentage
        int accepted = scores.size() - gradeDist[0];
        double acceptancePercentage = 100.0 * accepted / scores.size();
        return acceptancePercentage;
    }

    private static int[] calculateGrades(ArrayList<Integer> scores) {
        // calculate the grades
        int[] gradeDist = {0, 0, 0, 0, 0, 0};
        for (int score : scores) {
            int grade = Math.min(Math.max(5, score / 5), 10) - 5;
            gradeDist[grade]++;
        }
        return gradeDist;
    }

    private static ArrayList<Integer> collectScores(Scanner lukija) {
        ArrayList<Integer> scores = new ArrayList<Integer>();
        int inp = lukija.nextInt();
        while (inp != -1) {
            if (inp >= 0 && inp <= 60) {
                scores.add(inp);
            }
            inp = lukija.nextInt();
        }
        return scores;
    }
}
