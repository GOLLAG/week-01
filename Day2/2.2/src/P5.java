import java.util.Scanner;
public class P5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int start = 1;
        while (start<=n){
            if (start%3==0 && start%5==0){
                System.out.println(start+" FizzBuzz");
            } else if (start%3==0){
                System.out.println(start +" Fizz");
            } else if (start%5==0){
                System.out.println(start + " Buzz");
            }
            start+=1;
        }
    }
}
