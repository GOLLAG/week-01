import java.util.Scanner;
public class P4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        int maxdigit=10;
        int[] arr = new int[maxdigit];
        int index=0;
        while (n > 0) {
            if (index == maxdigit) {
                maxdigit += 10;
                int[] temp = new int[maxdigit];
                System.arraycopy(arr, 0, temp, 0, arr.length);
                arr = temp;
            }
            arr[index] = (int) (n % 10);
            n /= 10;
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
