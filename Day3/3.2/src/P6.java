import java.util.Scanner;
public class P6 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.print("Enter no of persons ");
        int n = num.nextInt();
        double[] weight = new double[n];
        double[] height = new double[n];
        double[] BMI = new double[n];
        String[] Status = new String[4];
        Status[0] = "Underweight";
        Status[1] = "Normal";
        Status[2] = "Overweight";
        Status[3] = "Obese";
        System.out.print("Enter weights");
        for(int i =0;i<n;i++){
            weight[i] = num.nextInt();
        }
        System.out.print("Enter heights in cm");
        float temp=0;
        for(int i=0;i<n;i++){
            temp=num.nextInt();
            temp*=(float)(0.01);
            height[i] = temp;
        }
        for(int i=0;i<n;i++){
            BMI[i]=(weight[i]/(height[i]*height[i]));
        }
        for(int i =0;i<n;i++) {
            if (BMI[i] <= 18.4) {
                System.out.printf("height = %.2f, weight = %.2f, BMI = %.2f, and weight status= %s%n",height[i],weight[i],BMI[i],Status[0]);
            } else if (BMI[i] <= 24.9) {
                System.out.printf("height = %.2f, weight = %.2f, BMI = %.2f, and weight status= %s%n",height[i],weight[i],BMI[i],Status[1]);
            } else if (BMI[i] <= 39.9) {
                System.out.printf("height = %.2f, weight = %.2f, BMI = %.2f, and weight status= %s%n",height[i],weight[i],BMI[i],Status[2]);
            } else {
                System.out.printf("height = %.2f, weight = %.2f, BMI = %.2f, and weight status= %s%n",height[i],weight[i],BMI[i],Status[3]);
            }
        }
    }
}
