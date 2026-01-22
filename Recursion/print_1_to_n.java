package Recursion;

public class print_1_to_n {
    public static void main(String[] args) {
        printNumbers(5);
    }
    public static void printNumbers(int n) {
        if (n == 0) {
            return;
        }
        printNumbers(n - 1);
        System.out.println(n);
    }
}
