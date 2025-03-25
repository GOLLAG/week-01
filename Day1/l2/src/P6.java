import java.util.Scanner;
public class P6 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        float salary = num.nextFloat();
        float bonus = num.nextFloat();
        System.out.println("The salary is INR "+salary+" and bonus is INR "+bonus+". Hence Total Income is INR "+(salary+bonus));
    }
}
