import java.util.Scanner;
public class P10 {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        System.out.println("Enter a num max 9 digits");
        int num = n.nextInt();
        int count = String.valueOf(num).length();
        int[] arr = new int[count];
        int temp=num;
        for(int i=0;i<count;i++){
            arr[i] = temp%10;
            temp/=10;
        }
        int[] frequency = new int[10];
        for(int i =0;i<count;i++){
                frequency[arr[i]]+=1;
        }
        for(int i=0;i<10;i++){
            System.out.println("Frequency of "+i+" is "+frequency[i]);
        }
    }
}
