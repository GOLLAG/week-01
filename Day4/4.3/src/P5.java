import java.util.Scanner;
public class P5 {

    public static boolean prime(int num) {
        if (num < 2) return false;
        for (int i = 2; i < (num/2)+1; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean neon(int num) {
        int square = num * num;
        int sum = 0;

        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }

        return sum == num;
    }

    public static boolean spy(int num) {
        int sum = 0, product = 1;

        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }

        return sum == product;
    }

    public static boolean automorphic(int num) {
        int square = num * num;
        int t = num%10;
        int q = square%10;

        return t==q;
    }

    public static boolean buzz(int num) {
        return num % 7 == 0 || num % 10 == 7;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        input.close();

        System.out.println("Prime = " + prime(num));
        System.out.println("Neon = " + neon(num));
        System.out.println("Spy = " + spy(num));
        System.out.println("Automorphic = " + automorphic(num));
        System.out.println("Buzz = " + buzz(num));
    }
}
