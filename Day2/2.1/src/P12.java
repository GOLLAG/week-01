import java.util.Scanner;
public class P12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int n1 = n;
        int total = 0;
        while (n>=1){
            total+=n;
            n-=1;
        }
        System.out.println(total==(n1*(n1+1)/2));
        System.out.println(total);
        System.out.println(n1*(n1+1)/2);
    }
}
