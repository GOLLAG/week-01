import java.util.Scanner;
public class P6 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        if (n>0){
            System.out.println("positive");
        } else if (n<0){
            System.out.println("negative");
        } else{
            System.out.println("Zero");
        }

    }
}
