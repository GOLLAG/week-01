import java.util.Scanner;
public class P1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n<1582) {
            System.out.println("Invalid Input");
        } else if(n%400==0) {
            System.out.println("Leap Year");
        } else if (n%100==0) {
            System.out.println("Not a Leap Year");
        } else if (n%4==0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
    }
}
