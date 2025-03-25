import java.util.Scanner;
public class P3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[10];
        int index=0;
        int temp=0;
        while(n>0){
            if(index==10){
                break;
            }
            temp=n%10;
            n/=10;
            arr[index]=temp;
            index++;
        }
        int lar=0;
        int sec=0;
        for(int i=0;i<arr.length;i++){
            if (lar<arr[i]){
                sec=lar;
                lar=arr[i];
            }else if(arr[i] > sec && arr[i] != lar){
                sec=arr[i];
            }
        }
        System.out.println("Largest = "+lar+"\nSecond ="+sec);
    }
}
