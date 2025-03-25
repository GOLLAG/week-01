import java.util.Scanner;
public class P11 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        double principal,Rate,Time;
        principal = num.nextDouble();
        Rate = num.nextDouble();
        Time = num.nextDouble();
        System.out.println("The Simple Interest = "+principal*Rate*(Time/100));
    }
}
