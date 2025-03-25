import java.util.Scanner;
public class P10 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        double total = 0.0;
        double n = num.nextDouble();
        while (n!=0){
            total+=n;
            n=num.nextDouble();
        }
        System.out.println(total);
    }
}
