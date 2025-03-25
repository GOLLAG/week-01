import java.util.Scanner;
public class P15 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        int n=num.nextInt();
        int total = 1;
        for (int i=n;i>=1;i--){
            total*=i;
        }
        System.out.println(total);
    }
}
