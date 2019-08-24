
public class Grades {

    private int[] grades = {0, 0, 0, 0, 0, 0};
    private int admit_rate = 0;

    public void grade(int score) {

        if (score >= 0 && score <= 29) {
            this.grades[0] += 1;
        } else if (score >= 30 && score <= 34) {
            this.grades[1] += 1;
            this.admit_rate++;
        } else if (score >= 35 && score <= 39) {
            this.grades[2] += 1;
            this.admit_rate++;
        } else if (score >= 40 && score <= 44) {
            this.grades[3] += 1;
            this.admit_rate++;
        } else if (score >= 45 && score <= 49) {
            this.grades[4] += 1;
            this.admit_rate++;
        } else if (score >= 50 && score <= 60) {
            this.grades[5] += 1;
            this.admit_rate++;
        }
    }

    public void printGrades() {
        System.out.println("Grade distribution: ");
        for (int i = this.grades.length - 1; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int j = 0; j < this.grades[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printPercentage() {
        double total = 0.0;
        for (int grade : grades) {
            total += grade;
        }

        double acceptRate = 100 * this.admit_rate / total;
        System.out.println("Acceptance percentage: " + acceptRate);
    }

}
