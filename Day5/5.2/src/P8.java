import java.util.Scanner;
import java.util.Random;
public class P8 {


    public static int[] generateRandomAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90) + 10; // Random 2-digit number (10-99)
        }
        return ages;
    }


    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            result[i][0] = String.valueOf(age);
            if (age < 0) {
                result[i][1] = "false"; // Negative ages cannot vote
            } else if (age >= 18) {
                result[i][1] = "true"; // Can vote
            } else {
                result[i][1] = "false"; // Cannot vote
            }
        }
        return result;
    }


    public static void displayVotingEligibility(String[][] data) {
        System.out.println("Age\tCan Vote?");
        System.out.println("-------------------");
        for (int i = 0; i < data.length; i++) {
            int age = Integer.parseInt(data[i][0]);
            boolean canVote = Boolean.parseBoolean(data[i][1]);
            System.out.println(age + "\t" + canVote);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt(); // You can input 10 for your case


        int[] ages = generateRandomAges(n);


        String[][] eligibilityData = checkVotingEligibility(ages);


        displayVotingEligibility(eligibilityData);


    }
}
