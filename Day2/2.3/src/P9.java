import java.util.Scanner;
public class P9 {
    public static void main(String[] main){
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();
        int sum = 0;
        for (int i=1; i<num; i++){
            if (num%i==0){
                sum+=i;
            }
        }
        if(sum>num){
            System.out.println("Abundant Number");
        }else{
            System.out.println("Not an Abundant Number");
        }
    }
}
