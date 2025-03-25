import java.util.Scanner;
public class P3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double n1 = a + b *c;
        double n2 = a * b + c;
        double n3 = c + a / b;
        double n4 = a % b + c;
        System.out.printf("The results of Int Operations are %.2f, %.2f, %.2f,and%.2f",n1,n2,n3,n4);

    }
}