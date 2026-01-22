package Recursion;

public class fibono_series {
    public static void main(String[] args) {
        int n = 7; // Number of terms in Fibonacci series
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
        public static int fibonacci(int n) {
            if (n <= 1) {
                return n;
            }
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

