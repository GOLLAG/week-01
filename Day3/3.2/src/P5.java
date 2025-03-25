import java.util.Scanner;
public class P5 {
    public static void main(String[] args){
        Scanner n= new Scanner(System.in);
        int num = n.nextInt();
        int count=0;
        int temp=num;
        int t=0;
        while(num>0){
            count++;
            num/=10;
        }
        int[] arr = new int[count];
        for(int i=0;i<count;i++){
            arr[i] = temp%10;
            temp/=10;
        }
        for(int i= 0; i<count;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
