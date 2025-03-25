import java.util.Scanner;
public class P7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no of Persons ");
        int n= input.nextInt();
        double[][] personData = new double[n][3];
        String[] weightStatus = new String[n];
        double p=0;

        for(int i=0;i<n;i++){
            System.out.println("Enter weight (kg) and height (cm) for Person " + (i + 1));
            double weight;
            double height;
            do{
                System.out.println("enter weight");
                weight = input.nextDouble();
                if (weight<=0) System.out.println("Enter positive values");
            } while (weight<=0);

            do{
                System.out.println("enter height");
                height = input.nextDouble();
                if(height<=0) System.out.println("enter positive value");
            } while(height<=0);

            height /= 100;

            personData[i][0] = weight;
            personData[i][1] = height;
            personData[i][2] = weight/(height*height);

        }
        for (int i=0;i<n;i++){
            if (personData[i][2]<=18.4) {
                weightStatus[i] = "Underweight";
            }else if (personData[i][2]<=24.9){
                weightStatus[i] = "Normal";
            }else if (personData[i][2]<=39.9){
                weightStatus[i] = "OverWeight";
            }else if (personData[i][2]>=40.0){
                weightStatus[i] = "Obese";
            }
        }
        for (int i=0;i<n;i++){
            System.out.printf("Person "+(i+1)+" weight is %.2f, height is %.2f,BMI is %.2f, weight status is %s",personData[i][0],personData[i][1],personData[i][2],weightStatus[i]+"\n");
        }
    }
}