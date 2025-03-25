import java.util.Scanner;
public class P2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            if (arr[i] > 0) {
                if (arr[i] % 2 == 0) {
                    System.out.println(arr[i] + " is even");
                } else {
                    System.out.println(arr[i] + " is odd");
                }
            }else if (arr[i]==0){
                System.out.println(arr[i]+" is zero");
            }else{
                System.out.println(arr[i]+" is negative");
            }
        }
        if (arr[0] == arr[4]) {
            System.out.println(" the first and last elements of the array are equal");
        } else if (arr[0] > arr[4]) {
            System.out.println(" the first element of the array is greater tha last element");
        }else  {
            System.out.println(" the first element of the array is smaller than last element");
        }
    }
}