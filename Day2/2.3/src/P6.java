import java.util.Scanner;
public class P6 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int count =0;
        int number = n;
        while(number>0){
            number/=10;
            count++;
        }
        System.out.println(count);
    }
}
