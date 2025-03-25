import java.util.Scanner;
public class P3 {
    public static void main(String[] args){
        Scanner n =new Scanner(System.in);
        int num = n.nextInt();
        int[] arr = new int[10];
        for(int i =1;i<=10;i++){
            arr[i-1]=(num*i);
        }
        for (int i =0;i<10;i++){
            System.out.println(num+" * "+(i+1)+" = "+ arr[i]);
        }
    }
}
