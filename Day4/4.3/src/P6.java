import java.util.Arrays;
import java.util.Scanner;

public class P6 {

    public static int factors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count;
    }

    public static int[] arr(int num) {
        int count = factors(num);
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    public static int greatest(int[] factors) {
        int maxFactor = Integer.MIN_VALUE;
        for (int factor : factors) {
            if (factor > maxFactor) {
                maxFactor = factor;
            }
        }
        return maxFactor;
    }

    public static int sum(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static long prod(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static long product_cubes(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= (int)Math.pow(factor, 3);
        }
        return product;
    }

    public static boolean Perfect(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    public static boolean Abundant(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum > num;
    }

    public static boolean Deficient(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum < num;
    }

    public static boolean Strong(int num) {
        int sum = 0, temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == num;
    }

    private static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        input.close();

        int[] factors = arr(num);

        System.out.println("Factors = " + Arrays.toString(factors));
        System.out.println("Greatest Factor = " + greatest(factors));
        System.out.println("Sum of Factors = " + sum(factors));
        System.out.println("Product of Factors = " + prod(factors));
        System.out.println("Product of Cubes = " + product_cubes(factors));
        System.out.println("Perfect = " + Perfect(num));
        System.out.println("Abundant = " + Abundant(num));
        System.out.println("Deficient = " + Deficient(num));
        System.out.println("Strong = " + Strong(num));
    }
}
