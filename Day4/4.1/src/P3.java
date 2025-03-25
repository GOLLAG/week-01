import java.util.Scanner;

public class P3 {

    public double handshakes (double students){
        double shakes = (students*(students-1))/2;
        return shakes;

    }




    public static void main(String[] args) {

        double numofstudents;
        Scanner input  =  new Scanner(System.in);
        numofstudents= input.nextDouble();
        P3 obj = new P3();
        double shakes = obj.handshakes(numofstudents);

        System.out.println(shakes);



    }

}