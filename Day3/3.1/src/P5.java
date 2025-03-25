import java.util.Scanner;
public class P5 {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        System.out.println("Enter an integer ");
        int num = n.nextInt();
        int[] arr = new int[4];
        int start = 6;
        for(int i=0;i<4;i++){
            arr[i] = num*start;
            start+=1;
        }
        for(int i=0;i<4;i++){
            System.out.println(arr[i]);
        }
    }
}
