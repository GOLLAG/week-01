import java.util.Scanner;
public class P10 {
    public static double[][] bmi(double[][] arr){
        for(int i=0;i<10;i++){
            arr[i][2] = arr[i][0]/(arr[i][1]*arr[i][1]);
        }
        return arr;
    }
    public static String[] status(double[][] arr){
        String[] statuses = new String[10];
        for(int i=0;i<10;i++){
            if(arr[i][2]<=18.4){
                statuses[i] = "Underweight";
            }else if(arr[i][2]<=24.9){
                statuses[i] = "Normal";
            }else if(arr[i][2]<=39.9){
                statuses[i] = "Overweight";
            }else {
                statuses[i]= "Obese";
            }
        }
        return statuses;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double[][] arr = new double[10][3];
        for(int i=0;i<10;i++){
//            System.out.println("Enter weight and height for person "+(i+1));
            for(int j=0;j<2;j++){
                double h=input.nextDouble();
                if(j==1){
                    h*=(0.01);
                }
                arr[i][j]=h;
            }
        }
        double[][] arr1 = P10.bmi(arr);
        String[] sta_tus = P10.status(arr1);
        for(int i=0;i<10;i++){
            System.out.println("BMI status for person "+(i+1)+" is "+sta_tus[i]);
        }
    }
}
