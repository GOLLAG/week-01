import java.util.Scanner;
public class P17 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Salary ");
        int n = input.nextInt();
        System.out.println("Years of Service ");
        int num = input.nextInt();
        double bonus =  n *((float)5/100);
        if (num>5){
            System.out.println("Bonus amt = "+bonus);
        }
    }
}
