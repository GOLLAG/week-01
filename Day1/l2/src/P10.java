import java.util.Scanner;
public class P10 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        int N = num.nextInt();
        int M = num.nextInt();
        System.out.println("The number of chocolates each child gets is "+ N/M + " and the number of remaining chocolates are " + N%M);
    }
}
