import java.util.Scanner;
public class P9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        float[][] marks = new float[n][3];
        float pr = 0;
        System.out.println("Max marks 100");
        for(int i=0;i<n;i++){
            float p;
            float c;
            float m;

            do {
                System.out.println("enter phy marks ");
                p = input.nextFloat();
                if (p < 0) {
                    System.out.println("Enter valid marks ");}
            }while(p<0);
            do {
                System.out.println("Enter che marks ");
                c=input.nextFloat();
                if (c<0) System.out.println("Enter valid marks ");
            } while(c<0);
            do{
                System.out.println("Enter mat marks");
                m= input.nextFloat();
                if(m<0) System.out.println("Enter valid marks");
            }while(m<0);

            marks[i][0] = p;
            marks[i][1] = c;
            marks[i][2] = m;
        }
        for(int i=0;i<n;i++){
            pr = (marks[i][0]+marks[i][1]+marks[i][2])/3;
            if (pr>=80){
                System.out.printf("phy marks = %.2f,che marks =%.2f,mat marks =%.2f,percentage is %.2f and grade is level4(above agency standard) \n",marks[i][0],marks[i][1],marks[i][2],pr);
            }else if (pr>=70){
                System.out.printf("phy marks = %.2f,che marks =%.2f,mat marks =%.2f,percentage is %.2f and grade is level3(agency standard) \n",marks[i][0],marks[i][1],marks[i][2],pr);
            }else if (pr>=60){
                System.out.printf("phy marks = %.2f,che marks =%.2f,mat marks =%.2f,percentage is %.2f and grade is level2(below agency standard) \n",marks[i][0],marks[i][1],marks[i][2],pr);
            }else if (pr>=50){
                System.out.printf("phy marks = %.2f,che marks =%.2f,mat marks =%.2f,percentage is %.2f and grade is level1(well below agency standard) \n",marks[i][0],marks[i][1],marks[i][2],pr);
            }else if (pr>=40){
                System.out.printf("phy marks = %.2f,che marks =%.2f,mat marks =%.2f,percentage is %.2f and grade is level1(too below agency standard) \n",marks[i][0],marks[i][1],marks[i][2],pr);
            }else {
                System.out.printf("phy marks = %.2f,che marks =%.2f,mat marks =%.2f,percentage is %.2f and grade is (Remedial standard) \n",marks[i][0],marks[i][1],marks[i][2],pr);
            }
        }
    }
}
