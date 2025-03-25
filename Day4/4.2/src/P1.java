import java.util.Scanner;
public class P1 {
    public static int[] arr(int n){
        int count =0;
        for(int i=1;i<=n;i++){
            if (n%i==0){
            count++;}
        }
        int index=0;
        int[] getdigits = new int[count];
        for(int i=1;i<=n;i++){
            if(n%(i)==0){
                getdigits[index++] = i;
            }
        }
        return getdigits;
    }
    public int add(int[] array){
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        return sum;
    }

    public int product(int[] array){
        int p=1;
        for(int i=0;i<array.length;i++){
            p*=array[i];
        }
        return p;
    }

    public int sq(int[] array){
        int s=0;
        for(int i=0;i<array.length;i++){
            s+=(int)Math.pow(array[i], 2);
        }
        return s;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] digits = P1.arr(n);
        P1 obj = new P1();
        int Sum = obj.add(digits);
        int pro = obj.product(digits);
        int square = obj.sq(digits);
        System.out.printf("Sum =%d, product = %d,SquareSum =%d",Sum, pro, square);
    }
}
