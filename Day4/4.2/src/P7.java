import java.util.Scanner;
public class P7 {
    public boolean canStudentVote(int age){
        if(age<18){
            return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter 10 values");
        for(int i=0;i<arr.length;i++){
            int j = input.nextInt();
            arr[i] = j;
        }
        P7 b = new P7();
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" can vote "+ b.canStudentVote(arr[i]));

        }
    }
}
