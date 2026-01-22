package Maths;

public class armstrong_number {
    public static void main(String[] args) {
        int n = 153;
        int original = n;
        int sum = 0;
        int digits = 0;
        int temp = n;

        // Count number of digits
        while (temp != 0) {
            digits++;
            temp /= 10;
        }

        temp = n;
        // Calculate sum of cubes of digits
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is not an Armstrong number");
        }
    }
}
