import java.util.Scanner;
public class P1 {
    public static int num(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }

    public static double mean(int n){
        double num =n/(float)11;
        return num;
    }

    public static int shrt(int[] arr){
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            min=Math.min(arr[i],min);
        }
        return min;
    }

    public static int tall(int[] arr){
        int max = 0;
        for(int i=0;i<arr.length;i++){
            max=Math.max(arr[i],max);
        }
        return max;
    }

    public static void main(String[] args){
        int[] arr = new int[11];
        for(int i=0;i<arr.length;i++){
            arr[i] = (int)(Math.random()*101)+150;
        }
        int sum = P1.num(arr);
        double means = P1.mean(sum);
        System.out.println("Sum of all heights = "+sum);
        System.out.println("Mean of all heights = "+means);
        System.out.println("Shortest of all heights = "+(P1.shrt(arr)));
        System.out.println("tallest of all heights = "+(P1.tall(arr)));

    }
}