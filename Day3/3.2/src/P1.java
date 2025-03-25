import java.util.Scanner;
public class P1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double[][] emp = new double[10][2];
        double[][] sal = new double[10][2];
        double total_bonus = 0;
        double total_old_salary = 0;
        double total_new_salary = 0;

        for(int i =0;i<10;i++) {
            System.out.println("Enter the salary and years of service for employee " + (i + 1));
            for (int j = 0; j < 2; j++) {
                emp[i][j] = input.nextDouble();
                if (emp[i][j] <= 0) {
                    System.out.println("Check and enter again");
                    j -= 1;
                }
            }
        }
        for (int i=0;i<10;i++){
            if ((emp[i][1])>=5){
                double t = emp[i][0]*(0.05);
                sal[i][0]= (emp[i][0] + t);
                sal[i][1] = emp[i][0]*(0.05);
            }else{
                double t = emp[i][0]*(0.02);
                sal[i][0]= (emp[i][0] + t);
                sal[i][1] = emp[i][0]*(0.02);
                }
            }
        for(int i=0;i<10;i++){
            total_bonus+=sal[i][1];
            total_old_salary += emp[i][0];
            total_new_salary += sal[i][0];
        }
        System.out.println(total_bonus);
        System.out.println(total_old_salary);
        System.out.println(total_new_salary);
    }
}
