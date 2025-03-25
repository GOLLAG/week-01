import java.util.Scanner;
public class P7 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        int n1 = num.nextInt();
        int n2 = num.nextInt();
        boolean b1= (n1 == 3 && n2 >= 20 && n2 <= 31);
        boolean b2= (n1 == 4 && n2 >= 1 && n2 <= 30);
        boolean b3= (n1 == 5 && n2 >= 1 && n2 <= 31);
        boolean b4= (n1 == 6 && n2 >= 1 && n2 <= 20);
        System.out.println(b1 || b2 || b3 || b4);
    }
}
