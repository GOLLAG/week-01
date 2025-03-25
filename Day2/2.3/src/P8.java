import java.util.Scanner;
public class P8 {
    public static void main (String[] args){
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();
        int res = 0;
        int k = num;
        while(num>0){
            int temp = num%10;
            res+=temp;
            num/=10;
        }if (k%res==0){
            System.out.println("Harshad number");
        }else{
            System.out.println("Not Harshad");
        }
    }
}
