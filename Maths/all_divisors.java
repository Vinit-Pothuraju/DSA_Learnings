package Maths;
public class all_divisors {
    public static void main(String[] args) {
        int n = 28;
        System.out.print("All divisors of " + n + " are: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}