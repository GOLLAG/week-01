import java.util.Scanner;
public class P7 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int n1 = num.nextInt();
        n = n+n1;
        n1=n-n1;
        n=n-n1;
        System.out.println(n+" "+n1);
    }
}
