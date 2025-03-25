import java.util.Scanner;

public class P1 {

    public double simple(double Principle,double Rate, double Time){

        double simpleint = (Principle*Rate*Time)/100;


        return simpleint;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the Principle ");
        double Principle = input.nextDouble();


        System.out.println(("enter the Rate "));
        double Rate = input.nextDouble();

        System.out.println("enter the TIme ");
        double Time = input.nextDouble();


        P1 obj = new P1();

        double interest = obj.simple(Principle,Rate,Time);
        System.out.println(interest);



    }

}