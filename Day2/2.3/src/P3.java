import java.util.Scanner;
public class P3 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Max Marks 100");
        System.out.println("Enter Physics marks");
        int p = num.nextInt();
        System.out.println("Enter Chemistry marks");
        int c = num.nextInt();
        System.out.println("Enter Math marks");
        int m = num.nextInt();

        float avg = (float) (p + c + m) / 3;
        if (avg >= 80) {
            System.out.println("Level 4, above agency , Avg marks =" + avg);
        } else if (avg >= 70 ) {
            System.out.println("Level 3, agency level, Avg marks =" + avg);
        } else if (avg >= 60) {
            System.out.println("Level 2, below agency , Avg marks =" + avg);
        } else if (avg >= 50) {
            System.out.println("Level 1, way below agency , Avg marks =" + avg);
        } else if (avg >= 40) {
            System.out.println("Level 1-, too below agency , Avg marks =" + avg);
        } else{
            System.out.println("Remedial, Avg marks ="+avg);
        }
    }
}
