import java.util.Scanner;
public class P10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int greatest_factor = 1;
        int count = n-1;
        while (count>1) {
            if (n%count==0){
                System.out.println(count);
                break;
            }count-=1;
        }
    }
}
