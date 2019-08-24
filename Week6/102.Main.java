
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Grades grades = new Grades();

        int score = 0;

        System.out.println("Type exam scores, -1 completes: ");

        do {
            score = Integer.parseInt(reader.nextLine());
            grades.grade(score);
        } while (score != -1);

        grades.printGrades();
        grades.printPercentage();

    }

}
