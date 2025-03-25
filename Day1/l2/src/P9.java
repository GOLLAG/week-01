import java.util.Scanner;
public class P9 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.println("Enter dist in km ");
        double side1 = num.nextDouble();
        double side2 = num.nextDouble();
        double side3 = num.nextDouble();

        double perimeter = side1+ side2+side3;

        double rounds = (double) 5/perimeter;
        System.out.println("the no of rounds is "+ rounds+ " to comlete 5km");
    }
}
