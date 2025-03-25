import java.util.Scanner;
public class P4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter num greater than 1");
        int n = input.nextInt();
        for (int i =2;i<n;i++){
            if (n%i==0){
                System.out.println("Not a prime");
                return;
            }
        }System.out.println("Prime");
    }
}
