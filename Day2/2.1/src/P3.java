import java.util.Scanner;
public class P3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        System.out.println("Is the first number the smallest? "+((n1>n2) && (n1>n3)));
        System.out.println("Is the second number the smallest? "+((n2>n1) && (n2>n3)));
        System.out.println("Is the first number the smallest? "+((n3>n1) && (n3>n2)));

    }
}