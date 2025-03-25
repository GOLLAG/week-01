import java.util.Scanner;
public class P5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int len = String.valueOf(n).length();
        int result = 0;
        int num = n;
        while(num>0){
            result+= Math.pow(num%10, len);
            num/=10;
        }
        if(result==n){
            System.out.println(result+" is Amstrong");
        }else{
            System.out.println(result+" Not an Amstrong");
        }
    }
}
