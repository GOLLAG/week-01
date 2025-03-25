import java.util.Scanner;

public class P2 {

    public double handshakes (double students){
        double shakes = (students*(students-1))/2;
        return shakes;

    }








    public static void main(String[] args) {

        double numofstudents;
        Scanner input  =  new Scanner(System.in);
        numofstudents= input.nextDouble();
        P2 obj = new P2();
        double shakes = obj.handshakes(numofstudents);

        System.out.println(shakes);



    }

}