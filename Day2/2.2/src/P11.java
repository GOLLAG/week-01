import java.util.Scanner;
public class P11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n<1 || n>100){
            return;
        }
        for (int i = 100;i>=1;i--){
            if (i%n==0){
                System.out.println(i);
            }
        }
    }
}
