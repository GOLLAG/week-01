import java.util.Scanner;
public class P14 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int pow = input.nextInt();
        int result = 1;
        while (pow>=1){
            result*=n;
            pow-=1;
        }System.out.println(result);
    }
}
