import java.util.Scanner;
public class P1 {

    public static boolean compare(String x,String y){
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)!=y.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static boolean eq(String x,String y){
        return x.equals(y);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s1 = input.next();
        String s2 = input.next();
        System.out.println(eq(s1,s2));
        System.out.println(compare(s1,s2));
    }
}