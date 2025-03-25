import java.util.Scanner;
public class P8 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        while (n >= 1){
            System.out.println(n);
            n-=1;
        }
    }
}
