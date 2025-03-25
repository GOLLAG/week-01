import java.util.Scanner;
public class P3 {
    public String leap(int num){
        String out;
        if(num%400==0 || (num%4==0&&num%100!=0)){
            out = "Leap Year";
        }else{
            out="Not a leap year";
        }
        return out;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(n<1582){
            System.out.println("Not valid year");
            return;
        }
        P3 i= new P3();
        System.out.println(i.leap(n));
    }
}