import java.util.Random;
public class P11 {
    static Random random = new Random();
    public static int[][] generateEmployeeData(int numEmployees) {
        int[][] employees = new int[numEmployees][2];
        for (int i = 0; i < numEmployees; i++) {
            employees[i][0] = 20000 + random.nextInt(80000); // Salary between 20k-100k
            employees[i][1] = 1 + random.nextInt(10); // Years of service between 1-10
        }
        return employees;
    }

    public static int[][] calculateNewSalaryAndBonus(int[][] employees) {
        int[][] updatedData = new int[employees.length][2];
        for (int i = 0; i < employees.length; i++) {
            double bonusRate = employees[i][1] > 5 ? 0.05 : 0.02;
            int bonus = (int) (employees[i][0] * bonusRate);
            updatedData[i][0] = employees[i][0] + bonus;
            updatedData[i][1] = bonus;
        }
        return updatedData;
    }

    public static void main(String[] args) {
        int[][] employees = generateEmployeeData(10);
        int[][] updatedData = calculateNewSalaryAndBonus(employees);

        System.out.println("Old Salary\tYears of Service\tNew Salary\tBonus");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i][0] + "\t\t" + employees[i][1] + "\t\t" + updatedData[i][0] + "\t\t" + updatedData[i][1]);
        }
    }
}
