import java.util.Scanner;
public class P8 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        String name ;
        String fromCity , viaCity , toCity ;
        double distanceFromToVia ;
        double distanceViaToFinalCity ;
        double  totalTime;
        System.out.println("Enter name");
        name = num.next();
        System.out.println("Enter from_city ");
        fromCity = num.next();
        System.out.println("Enter via_city");
        viaCity = num.next();
        System.out.println("Enter to_city");
        toCity = num.next();
        System.out.println("Enter distance from_to_via");
        distanceFromToVia = num.nextDouble();
        System.out.println("Enter distance via_to_final");
        distanceViaToFinalCity = num.nextDouble();
        System.out.println("Enter time taken");
        totalTime = num.nextDouble();

        double totalDistance = distanceFromToVia + distanceViaToFinalCity;

        System.out.println("The Total Distance travelled by " + name + " from " +
                fromCity + " to " + toCity + " via " + viaCity +
                " is " + totalDistance + " km and " +
                "the Total Time taken is " + totalTime + " minutes");
    }
}
