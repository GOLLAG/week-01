import java.util.Scanner;
public class P6 {
    public static double convertpounds2kilograms(double yards){
        double feet = yards*0.453592;
        return feet;
    }
    public static double kilograms2pounds(double ft){
        double yr = ft*2.20462;
        return yr;
    }
    public static double gallons2liters(double m){
        double in = m*3.78541;
        return in;
    }
    public static double liters2gallons(double i){
        double me = i*0.264172;
        return me;
    }
    public static double convertFarhenheitToCelsius(double farhenheit){
        double farhenheit2celsius = (farhenheit - 32) * ((float)5 / 9);
        return farhenheit2celsius;
    }
    public static double convertCelsiusToFarhenheit(double celsius){
        double celsius2farhenheit = (celsius * 9 / (float)5) + 32;
        return celsius2farhenheit;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temp in farhenheit");
        double f = input.nextDouble();
        System.out.println("Enter weight in pounds");
        double k = input.nextDouble();
        System.out.println("Enter quantity in gallons");
        double m = input.nextDouble();
        double cel = P6.convertFarhenheitToCelsius(f);
        double far = P6.convertCelsiusToFarhenheit(cel);
        double kg = P6.convertpounds2kilograms(k);
        double pon = P6.kilograms2pounds(kg);
        double lit = P6.gallons2liters(m);
        double gal = P6.liters2gallons(lit);
        System.out.println("pounds2kilograms = "+kg);
        System.out.println("kilograms2pounds = "+pon);
        System.out.println("gallons2liters = "+lit);
        System.out.println("liters2gallons = "+gal);
        System.out.println("farhenheit2celsius = "+cel);
        System.out.println("celsius2farhenheit = "+far);

    }
}