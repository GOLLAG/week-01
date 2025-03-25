import java.util.Scanner;
public class P11 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int total = 0;
        while (true){
            if (0>=n){
                break;
            }
            total+=n;
            n=num.nextInt();
        }
        System.out.println(total);
    }
}
