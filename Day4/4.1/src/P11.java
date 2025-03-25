import java.util.Scanner;

public class P11 {

    public static double calculateWindChill(double temperature, double windSpeed) {

        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the temperature (°F): ");
        double temperature = input.nextDouble();

        System.out.print("Enter the wind speed (mph): ");
        double windSpeed = input.nextDouble();


        double windChill = calculateWindChill(temperature, windSpeed);


        System.out.printf("The wind chill temperature is: %.2f°F\n", windChill);


    }
}
