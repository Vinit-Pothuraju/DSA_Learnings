package Maths;

public class Gcd_of_number {
    public static void main(String[] args) {
        int a = 56, b = 98;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("GCD is: " + a);
    }
}
