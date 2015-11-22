
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();

        while (true) {
            System.out.print("name: ");
            String name = reader.nextLine();
            if (name.isEmpty()) {
                System.out.println("");
                break;
            }
            System.out.print("studentnumber: ");
            String studentNumber = reader.nextLine();
            Student student = new Student(name, studentNumber);
            list.add(student);
        }
        
        for (Student student : list) {
            System.out.println(student);
        }
        
        System.out.println("");
        System.out.print("Give search term: ");
        String searchTerm = reader.nextLine();
        System.out.println("Result:");
        
        for (Student student : list) {
            if (student.getName().contains(searchTerm)) {
                System.out.println(student);
            }
        }
        
    }
}
