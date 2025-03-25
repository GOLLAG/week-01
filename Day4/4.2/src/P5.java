import java.util.Scanner;
public class P5 {
    public static double convertYardsToFeet(double yards){
        double feet = yards*3;
        return feet;
    }
    public static double convertfeet2yards(double ft){
        double yr = ft*0.333333;
        return yr;
    }
    public static double convertmeters2inches(double m){
        double in = m*39.3701;
        return in;
    }
    public static double convertinches2meters(double i){
        double me = i*0.0254;
        return me;
    }
    public static double convertinches2cm(double in){
        double cm = in*2.54;
        return cm;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter dist in yards");
        double k = input.nextDouble();
        System.out.println("Enter Dist in meters");
        double m = input.nextDouble();
        double feet = P5.convertYardsToFeet(k);
        double yards = P5.convertfeet2yards(feet);
        double inches = P5.convertmeters2inches(m);
        double meters = P5.convertinches2meters(inches);
        double ccm = P5.convertinches2cm(inches);
        System.out.println("YardsToFeet = "+feet);
        System.out.println("feet2yards = "+yards);
        System.out.println("meters2inches = "+inches);
        System.out.println("inches2meters = "+meters);
        System.out.println("inches2cm = "+ccm);

    }
}