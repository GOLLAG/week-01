import java.util.Arrays;
import java.util.Scanner;
public class P9 {
    public static double E_dist(double a, double b, double c, double d){
        double dist = Math.sqrt(Math.pow((c-a),2)+Math.pow((d-b),2));
        return dist;
    }
    public static String[] equation(double a, double b, double c, double d){
        double m=(d-b)/(c-a);
        double i = b-(m*a);
        return new String[]{String.valueOf(m),String.valueOf(i)};
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of points x1 and y1");
        double x1=input.nextDouble(),y1=input.nextDouble();
        System.out.print("Enter value of points x2 and y2");
        double x2=input.nextDouble(),y2=input.nextDouble();
        System.out.println("Eucli dist = "+ E_dist(x1,y1,x2,y2));
        String[] line = new String[2];
        line = equation(x1,y1,x2,y2);
        System.out.println("slope,intercept = "+ Arrays.toString(equation(x1, y1, x2, y2)));
        System.out.println("Equatio of line = "+ line[0]+"*x"+" + "+line[1]);
    }
}
