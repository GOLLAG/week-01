import java.util.Scanner;
public class P2 {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();
        if (num%400==0 || (num%100!=0 && num%4==0)){
            System.out.println("Leap Year");
        } else{
            System.out.println("Not a Leap Year");
        }
    }
}
