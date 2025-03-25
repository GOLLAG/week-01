import java.util.Scanner;

public class P5 {


    public int checknumber(int number){
        if (number<0){
            return -1;
        } else if (number>0) {
            return 1;

        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        P5 obj = new P5();

        int check = obj.checknumber(number);
        System.out.println(check);
    }

}