package Maths;

public class count_digits {
    public static void main(String[] args) {
        // Find the number of digits in an integer
        int n = 123456;
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        System.out.println("Number of digits: " + count);
    }
}
