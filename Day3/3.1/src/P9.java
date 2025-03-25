import java.util.Scanner;
public class P9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter rows ");
        int n1 = input.nextInt();
        System.out.print("Enter columns ");
        int n2 = input.nextInt();
        int[][] arr = new int[n1][n2];
        int[] arr1 = new int[n1*n2];

        for(int i=0;i<n1;i++){
            System.out.println("Enter values of "+(i+1)+" row");
            for(int j=0;j<n2;j++){
                arr[i][j] = input.nextInt();
            }
        }
        int idx =0;
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                arr1[idx] = arr[i][j];
                idx+=1;
            }
        }
        System.out.print("1D array ");
        for (int i = 0;i<(n1*n2);i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
