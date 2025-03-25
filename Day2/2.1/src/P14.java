import java.util.Scanner;
public class P14 {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();
        int total =1;
        while(num>=1){
            total*=num;
            num-=1;
        }
        System.out.println(total);
    }
}
