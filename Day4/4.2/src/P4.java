import java.util.Scanner;
public class P4 {
    public static double convertKmToMiles(double km){
        double miles = km*0.621371;
        return miles;
    }
    public static double convertMilesToKm(double mi){
        double ki = mi*1.60934;
        return ki;
    }
    public static double convertMetersToFeet(double m){
        double ft = m*3.28084;
        return ft;
    }
    public static double convertFeetToMeters(double f){
        double me = f*0.3048;
        return me;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter dist in km");
        double k = input.nextDouble();
        System.out.println("Enter Dist in meters");
        double m = input.nextDouble();
        double miles = P4.convertKmToMiles(k);
        double km = P4.convertMilesToKm(miles);
        double feet = P4.convertMetersToFeet(m);
        double met = P4.convertFeetToMeters(feet);
        System.out.println("km2miles = "+miles);
        System.out.println("miles2km = "+km);
        System.out.println("meters2feet = "+feet);
        System.out.println("feet2meters = "+met);

    }
}