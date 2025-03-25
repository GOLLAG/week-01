import java.util.Scanner;
public class P2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        System.out.println("Is the first number the smallest? "+((n1<n2) && (n1<n3)));
    }
}
