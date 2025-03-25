import java.util.Scanner;
public class P9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int greatest_factor = 1;
        for (int i=n-1;i>1;i--){
            if (n%i==0){
                greatest_factor=i;
                break;
            }
        }
        System.out.println(greatest_factor);
    }
}
