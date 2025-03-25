import java.util.Scanner;
public class P8 {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        System.out.print("enter a number ");
        int num = n.nextInt();
        int maxfactors = 10;
        int[] arr = new int[maxfactors];
        int index = 0;
        for(int i =1;i<(num/2 +1);i++){
            if(num%i==0){
                if((index)==maxfactors){
                    maxfactors*=2;
                    int[] temp = new int[maxfactors];
                    System.arraycopy(arr, 0, temp, 0, arr.length);
                    arr = temp;
                }
                arr[index++]= i;
            }
        }
        for (int i =0;i<index;i++){
            System.out.println(arr[i]);
        }
    }
}
