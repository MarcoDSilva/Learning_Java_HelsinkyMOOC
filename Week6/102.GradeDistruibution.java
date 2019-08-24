//to be refactored with classes

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int score = 0, admit_rate = 0;
        int grade_0 = 0, grade_1 = 0, grade_2 = 0, grade_3 = 0, grade_4 = 0, grade_5 = 0;
        double acceptRate;

        System.out.println("Type exam scores, -1 completes: ");
        do {
            score = Integer.parseInt(reader.nextLine());

            if (score >= 0 && score <= 29) {
                grade_0++;
            } else if (score >= 30 && score <= 34) {
                grade_1++;
                admit_rate++;
            } else if (score >= 35 && score <= 39) {
                grade_2++;
                admit_rate++;
            } else if (score >= 40 && score <= 44) {
                grade_3++;
                admit_rate++;
            } else if (score >= 45 && score <= 49) {
                grade_4++;
                admit_rate++;
            } else if (score >= 50 && score <= 60) {
                grade_5++;
                admit_rate++;
            }
        } while (score != -1);

        System.out.println("Grade distribution: ");

        printGrades(5, grade_5);
        printGrades(4, grade_4);
        printGrades(3, grade_3);
        printGrades(2, grade_2);
        printGrades(1, grade_1);
        printGrades(0, grade_0);

        double sum = grade_0 + grade_1 + grade_2 + grade_3 + grade_4 + grade_5;
        acceptRate = 100 * admit_rate / sum ;
        System.out.println("Acceptance percentage: " + acceptRate);

    }

    public static void printGrades(int grade, int grades) {
        System.out.print(grade + ": ");

        for (int i = 0; i < grades; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
