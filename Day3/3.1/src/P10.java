import java.util.Scanner;
public class P10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] arr = new String[n];
        if(n<0){
            System.exit(0);
        }
        for(int i =0;i<n;i++){
            if (i%3==0 && i%5==0){
                arr[i] = "FizzBuzz";
            }else if (i%3==0){
                arr[i] = "Fizz";
            }else if (i%5==0){
                arr[i] = "Buzz";
            }else{
                arr[i] = String.valueOf(i);
            }
        }
        for(int i =0;i<n;i++){
            System.out.println(arr[i]);
        }

    }
}
