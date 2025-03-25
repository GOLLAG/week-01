import java.util.Scanner;
public class P1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        float q = (float)n1/n2;
        float r = n1%(float)n2;
        System.out.println("The Quotient is "+ q +" and Reminder is "+r+" of two number "+n1+" and "+n2);
    }

}