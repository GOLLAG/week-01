import java.util.Scanner;
public class P3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        for (int i =6; i<=9; i++){
            System.out.println(n+" * "+i +" = "+(n*i));
        }
    }
}
