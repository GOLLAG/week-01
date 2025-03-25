import java.util.Arrays;
import java.util.Scanner;
public class P11 {
    static Scanner input = new Scanner(System.in);
    static double a;
    static double b;
    static double c;

    public double[] del(double d){
        double root1,root2;
        if(d>0){
            root1=(-b +(Math.sqrt(d))/(2*a));
            root2=(-b -(Math.sqrt(d))/(2*a));
            return new double[]{root1, root2};
        }else if(d==0){
            double root = -b/(2*a);
            return new double[]{root};
        }
        return new double[]{};
    }

    public static void main(String[] args){
        System.out.println("Enter values of a, b, c");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        double deelta = (Math.pow(b, 2))+(4*a*c);
        P11 dou = new P11();
        System.out.println(Arrays.toString(dou.del(deelta)));
    }
}
