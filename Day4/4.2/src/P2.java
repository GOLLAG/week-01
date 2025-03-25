import java.util.Scanner;
public class P2 {
    public int rec(int num){
        int sum;
        if(num==1){
            return 1;
        }else{
            sum=num+ rec(num-1);
        }
        return sum;
    }
    public int add(int num){
        int n=num*(num+1)/2;
        return n;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num<1){
            System.exit(0);
        }
        P2 z= new P2();
        System.out.println(z.add(num)==z.rec(num));
        System.out.println(z.add(num) +", "+z.rec(num));
    }
}