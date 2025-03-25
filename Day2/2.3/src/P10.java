import java.util.Scanner;
public class P10 {
    public static void main (String[] args){
        Scanner n = new Scanner(System.in);
        System.out.println("Enter num1");
        double num1 = n.nextDouble();
        System.out.println("Operator");
        String op = n.next();
        System.out.println("Enter num2");
        double num2 = n.nextDouble();
        double res;

        switch (op) {
            case "+":
                res = num1+num2;
                System.out.println(res);
                break;
            case "-":
                res = num1-num2;
                System.out.println(res);
                break;
            case "*":
                res = num1*num2;
                System.out.println(res);
                break;
            case "/":
                res = num1/num2;
                System.out.println(res);
                break;
            default:
                System.out.println("use only +,-,*,/");

        }
    }
}
