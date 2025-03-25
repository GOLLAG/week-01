//                  #1
//import java.util.Scanner;
//public class L2 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner (System.in);
//        int n1 = input.nextInt();
//        int n2 = input.nextInt();
//        float q = (float)n1/n2;
//        float r = n1%(float)n2;
//        System.out.println("The Quotient is "+ q +" and Reminder is "+r+" of two number "+n1+" and "+n2);
//    }
//
//}

//                  #2
//import java.util.Scanner;
//public class L2 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int a = input.nextInt();
//        int b = input.nextInt();
//        int c = input.nextInt();
//        int n1 = a + b *c;
//        int n2 = a * b + c;
//        float n3 = c + (float)a / b;
//        float n4 = (float)a % b + c;
//        System.out.printf("The results of Int Operations are %d, %d, %.2f,and%.2f",n1,n2,n3,n4);
//    }
//}

//                  #3
import java.util.Scanner;
public class L2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double n1 = a + b *c;
        double n2 = a * b + c;
        double n3 = c + a / b;
        double n4 = a % b + c;
        System.out.printf("The results of Int Operations are %.2f, %.2f, %.2f,and%.2f",n1,n2,n3,n4);

    }
}