import java.util.Scanner;
public class P8 {
    public int young(int age1,int age2,int age3){
        if(age1<age2&&age1<age3){
            return age1;
        }else if(age2<age1&&age2<age3){
            return age2;
        }else{
            return age3;
        }
    }
    public int tall(int h1,int h2,int h3){
        if(h1>h2&&h1>h3){
            return h1;
        }else if(h2>h1&&h2>h3){
            return h2;
        }else{
            return h3;
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ages of Amar, Akbar and Anthony");
        int a1 = input.nextInt();
        int a2 = input.nextInt();
        int a3 = input.nextInt();
        System.out.println("Enter heights of Amar, Akbar and Anthony");
        int t1 = input.nextInt();
        int t2 = input.nextInt();
        int t3 = input.nextInt();
        P8 obj = new P8();
        System.out.println("Youngest is "+obj.young(a1,a2,a3));
        System.out.println("tallest is "+obj.tall(t1,t2,t3));
    }
}
