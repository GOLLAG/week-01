import java.util.Scanner;
public class P7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Weight");
        double w = input.nextDouble();
        System.out.println("Enter Height");
        double height = input.nextDouble();
        height = height/100;
        double bmi = w/(height * height);
        if (bmi<=18.4){
            System.out.println("Underweight");
        }else if (bmi<=24.9){
            System.out.println("normal");
        }else if (bmi<=39.9){
            System.out.println("Overweight");
        }else if (bmi>=40){
            System.out.println("Obese");
        }
        System.out.println(bmi);
    }
}
