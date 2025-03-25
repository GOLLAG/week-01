import java.util.Scanner;

public class P1 {

    public static String[][] calculateBMI(double[][] persons) {
        String[][] result = new String[10][4];
        for (int i = 0; i < 10; i++) {
            double weight = persons[i][0];
            double heightCm = persons[i][1];
            double heightM = heightCm / 100;
            double bmi = weight / (heightM * heightM);
            String status = "";
            if (bmi < 18.5)
                status = "Underweight";
            else if (bmi < 24.9)
                status = "Normal";
            else if (bmi < 29.9)
                status = "Overweight";
            else
                status = "Obese";

            result[i][0] = String.format("%.2f", heightCm);
            result[i][1] = String.format("%.2f", weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        return result;
    }

    public static void display(String[][] data) {
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-10s %-10s %-10s %-15s\n", data[i][0], data[i][1], data[i][2], data[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] persons = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight (kg) and height (cm) for person " + (i + 1) + ":");
            persons[i][0] = sc.nextDouble();
            persons[i][1] = sc.nextDouble();
        }

        String[][] bmiData = calculateBMI(persons);
        display(bmiData);
    }
}
