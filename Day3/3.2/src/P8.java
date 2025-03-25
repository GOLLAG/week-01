import java.util.Scanner;
public class P8 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.print("Enter no of Students ");
        int n = num.nextInt();
        float[] phy = new float[n];
        float[] che = new float[n];
        float[] mat = new float[n];
        System.out.println("Max marks 100");
        for(int i=0;i<n;i++){
            System.out.println("Enter phy marks for student"+(i+1));
            float p = num.nextFloat();
            if(p<0){
                System.out.println("Enter valid marks");
                i--;
            }else{
            phy[i] = p;
            }
        }
        for(int i=0;i<n;i++){
            System.out.println("Enter che marks for student"+(i+1));
            float c = num.nextFloat();
            if(c<0){
                System.out.println("Enter valid marks");
                i--;
            }else {
                che[i] = c;
            }
        }
        for(int i=0;i<n;i++) {
            System.out.println("Enter mat marks for student" + (i + 1));
            float m = num.nextFloat();
            if (m < 0) {
                System.out.println("Enter valid marks");
                i--;
            } else {
                mat[i] = m;
            }
        }
        for(int i=0;i<n;i++){
            float pr = (phy[i]+che[i]+mat[i])/3;
            if (pr>=80){
                System.out.printf("phy marks = %.2f,che marks =%.2f,mat marks =%.2f,percentage is %.2f and grade is level4(above agency standard) \n",phy[i],che[i],mat[i],pr);
            }else if (pr>=70){
                System.out.printf("phy marks = %.2f,che marks =%.2f,mat marks =%.2f,percentage is %.2f and grade is level3(agency standard) \n",phy[i],che[i],mat[i],pr);
            }else if (pr>=60){
                System.out.printf("phy marks = %.2f,che marks =%.2f,mat marks =%.2f,percentage is %.2f and grade is level2(below agency standard) \n",phy[i],che[i],mat[i],pr);
            }else if (pr>=50){
                System.out.printf("phy marks = %.2f,che marks =%.2f,mat marks =%.2f,percentage is %.2f and grade is level1(well below agency standard) \n",phy[i],che[i],mat[i],pr);
            }else if (pr>=40){
                System.out.printf("phy marks = %.2f,che marks =%.2f,mat marks =%.2f,percentage is %.2f and grade is level1(too below agency standard) \n",phy[i],che[i],mat[i],pr);
            }else {
                System.out.printf("phy marks = %.2f,che marks =%.2f,mat marks =%.2f,percentage is %.2f and grade is (Remedial standard) \n",phy[i],che[i],mat[i],pr);
            }
        }
    }
}
