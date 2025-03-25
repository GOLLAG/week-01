import java.util.Scanner;
public class P4 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        float celsius = num.nextFloat();
        float farenheit_result = (celsius*((float)9/5)+32);
        System.out.println("The "+celsius+" celsius is "+farenheit_result+" fahrenheit");
    }
}
