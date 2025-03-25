import java.util.Arrays;
import java.util.Scanner;
public class P3 {

    public static int count(int num){
        int c=0;
        while(num>0){
            num/=10;
            c++;
        }
        return c;
    }

    public static int[] arr(int n, int count){
        int[] arr_dig = new int[count];
        int temp =n;
        for(int i=0;i<count;i++){
            int j=temp%10;
            arr_dig[i] = j;
            temp/=10;
        }
        return arr_dig;
    }

    public static int ss(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }

    public static boolean harshad(int n,int s){
        return n%s==0;
    }

    public static int[][] freq(int[] arr){
        int[][] col = new int[10][2];
        for(int i : arr){
            col[i][0] = i;
//            col[i][1]=0;
        }
        for(int i : arr){
            col[i][1]+=1;
        }
        return col;
    }

    public static int ssqre(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=((int)(Math.pow(arr[i],2)));
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int j = input.nextInt();
        int count = count(j);
        int[] a = arr(j, count);
        int sum = ss(a);
        int sum_squares = ssqre(a);
        int[][] frequency = freq(a);
        System.out.println("Count = " + count);
        System.out.println("digi_arr = "+ Arrays.toString(a));
        System.out.println("Sum = "+ sum);
        System.out.println("Sum_of_squares = "+sum_squares);
        for(int i=0;i<count;i++){
            System.out.println(frequency[i][0]+" : "+frequency[i][1]);
        }
    }
}
