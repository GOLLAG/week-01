import java.util.Scanner;
public class P4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n>0) {
            System.out.println("The sum of "+n+" natural numbers is "+(n*(n+1)/2));
        } else{
            System.out.println("The number "+n+" is not a natural number");
        }
    }
}
