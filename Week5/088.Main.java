
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);

        String name;
        String studentnumber;
        int i = 0;

        do {
            System.out.print("name: ");
            name = reader.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.print("studentnumber: ");
            studentnumber = reader.nextLine();

            if (!name.isEmpty()) {
                Student students = new Student(name, studentnumber);
                list.add(students);
            }
        } while (!name.isEmpty());

        System.out.println(list);
        
        System.out.print("Give search term: ");
        String term = reader.nextLine();
        
        System.out.println("Result: ");
        
        for(Student listinha: list) {
            if(listinha.getName().contains(term)){
                System.out.println(listinha);
            }
        }
    }
}
