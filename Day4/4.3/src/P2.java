import java.util.Arrays;
import java.util.Scanner;
public class P2 {
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

    public static boolean duck(int n){
        while (n>0){
            int digit = n%10;
            if(digit ==0){
                return true;
            }
            n/=10;
        }
        return false;
    }

    public static boolean arms(int n,int count){
        int s =0;
        int temp =n;
        for(int i=0;i<count;i++){
            int t = n%10;
            s+=((int)Math.pow(t, count));
            n/=10;
        }
        if(s==temp){
            return true;
        }else{
            return false;
        }
    }

    public static int[] lar(int[] arr){
        int largest = Integer.MIN_VALUE;
        int sec_largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                sec_largest = largest;
                largest = arr[i];
            } else if(arr[i]>sec_largest && arr[i]<largest){
                sec_largest=arr[i];
            }
        }
        return new int[]{largest,sec_largest};
    }

    public static int[] sma(int[] arr){
        int smallest = Integer.MAX_VALUE;
        int sec_smallest = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                sec_smallest = smallest;
                smallest = arr[i];
            } else if(arr[i]<sec_smallest && arr[i]>smallest){
                sec_smallest=arr[i];
            }
        }
        return new int[]{smallest,sec_smallest};
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = P2.count(n);
        int[] arr = P2.arr(n, count);
        int[] l = P2.lar(arr);
        int lar,sec_lar;
        lar = l[0];
        sec_lar = l[1];
        int[] s = P2.sma(arr);
        int small, sec_small;
        small = s[0];
        sec_small=s[1];
        System.out.println("count = "+count);
        System.out.println("digiarr = "+ Arrays.toString(arr));
        System.out.println("largest = "+lar+" ,Second largest ="+sec_lar);
        System.out.println("smallest = "+small+" ,Second smallest ="+sec_small);
        System.out.println("Armstrong = "+P2.arms(n,count));
        System.out.println("DuckNumber = "+P2.duck(n));
    }
}
