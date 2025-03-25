import java.util.Scanner;
public class P13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = 100;
        if (n<1||n>100){
            return;
        }
        while (count>0){
            if (count%n==0){
                System.out.println(count);
            }count-=1;
        }
    }
}
