import java.util.Scanner;
public class P12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int power = input.nextInt();
        int result=1;
        if(num<1||power<0){
            return;
        }
        for (int i=1;i<=power;i++){
            result*=num;
        }
        System.out.println(result);
    }
}
