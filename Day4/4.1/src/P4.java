import java.util.Scanner;

public class P4 {
    public double rounds(double side1,double side2,double side3){

        double perimeter = side1+ side2+side3;

        double noofrounds = (double) 5/perimeter;

        return noofrounds;
    }


    public static void main(String[] args) {

        double side1,side2,side3;

        Scanner input = new Scanner(System.in);
        side1 = input.nextDouble();
        side2 = input.nextDouble();
        side3 = input.nextDouble();
        P4 obj = new P4();
        double laps =  obj.rounds(side1,side2,side3);
        System.out.println(laps);
    }

}