import java.util.Scanner;
public class P16 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i=1; i<=n;i++){
            if (i%2==0){
                System.out.println(i+" is even");
            } else{
                System.out.println(i+" is odd");
            }
        }
    }
}
