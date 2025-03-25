import java.util.Scanner;
public class P2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double[] age = new double[3];
        double[] height = new double[3];
        String[] name = new String[3];
        name[0] = "Amar";
        name[1] = "Akbar";
        name[2] = "Antony";
        System.out.print("Enter age of 3 ");
        for (int i=0;i<3;i++){
            age[i] = input.nextDouble();
        }
        System.out.print("Enter height 3 ");
        for(int i=0;i<3;i++){
            height[i] = input.nextDouble();
        }
        double youngest;
        youngest = age[0];
        for(int i=1;i<3;i++){
            if(youngest>age[i]){
                youngest = age[i];
            }
        }
        double tallest;
        tallest = height[0];
        for(int i=1;i<3;i++){
            if(tallest<height[i]){
                tallest = height[i];
            }
        }
        for(int i=0;i<3;i++){
            if(youngest==age[i]){
                System.out.println(name[i]+" is youngest"+youngest);
            }
            if(tallest==height[i]){
                System.out.println(name[i]+" is tallest"+tallest);
            }
        }
    }
}