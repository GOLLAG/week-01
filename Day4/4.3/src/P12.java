import java.util.Scanner;
import java.util.Random;
public class P12 {

    public static int[][] generateStudentMarks(int numStudents) {
        Random rand = new Random();
        int[][] marks = new int[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
            marks[i][0] = 50 + rand.nextInt(51); // Physics (50-100)
            marks[i][1] = 50 + rand.nextInt(51); // Chemistry (50-100)
            marks[i][2] = 50 + rand.nextInt(51); // Maths (50-100)
        }
        return marks;
    }

    public static double[][] computeResults(int[][] marks) {
        double[][] results = new double[marks.length][3];

        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    public static void displayResults(int[][] marks, double[][] results) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        for (int i = 0; i < marks.length; i++) {
            System.out.println((i + 1) + "\t" + marks[i][0] + "\t" + marks[i][1] + "\t\t" + marks[i][2] + "\t" + results[i][0] + "\t" + results[i][1] + "\t" + results[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numStudents = sc.nextInt();
        int[][] marks = generateStudentMarks(numStudents);
        double[][] results = computeResults(marks);
        displayResults(marks, results);
    }
}
