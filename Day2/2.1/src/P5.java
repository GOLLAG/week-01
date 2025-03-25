import java.util.Scanner;
public class P5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n>=18){
            System.out.printf("The person's age is %d and can vote",n);
        } else{
            System.out.printf("The person's age is %d and cannot vote",n);
        }
    }
}
