import java.util.Scanner;
public class P9 {
    public static String isPositive(int n){
        if(n>=0){
            return "isPossitive";
        }else {
            return "isnegative";
        }
    }
    public static String iseven(int n){
        if(n%2==0){
            return "Even";
        }else{
            return "Odd";
        }
    }
    public static String compare(int n1,int n2){
        if(n1==n2){
            return "equal";
        }else if(n1>n2){
            return "greater";
        }else{
            return "lesser";
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 numbers");
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" is "+P9.isPositive(arr[i]));
            System.out.println(arr[i]+" is "+P9.iseven(arr[i]));
        }
        System.out.println("first element of the array is "+P9.compare(arr[0],arr[4])+" to last");
    }
}
