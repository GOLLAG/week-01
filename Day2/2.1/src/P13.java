import java.util.Scanner;
public class P13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        int total = 0;
        if (n >= 1) {
            for (int i=n;i>=1;i--){
                total+=i;
            }
            sum = n*(n+1)/2;
            System.out.println(sum==total);
            System.out.println(sum);
            System.out.println(total);
        }else{
            System.out.println("Num is not a Natural Number");
        }
    }
}
