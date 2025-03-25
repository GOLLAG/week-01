import java.util.Scanner;
public class P2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int n1 = a + b *c;
        int n2 = a * b + c;
        float n3 = c + (float)a / b;
        float n4 = (float)a % b + c;
        System.out.printf("The results of Int Operations are %d, %d, %.2f,and%.2f",n1,n2,n3,n4);
    }
}