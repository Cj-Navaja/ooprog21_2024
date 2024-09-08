public class Prelim {

    public static int fibonacci(int n) {
        if (n < 0) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int[] fib = new int[n + 1];
            fib[0] = 0;
            fib[1] = 1;
            for (int i = 2; i <= n; i++) {
                fib[i] = fib[i - 1] + fib[i - 2];
            }
            return fib[n];
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 7; i++) {
            System.out.println("Fibonacci(" + i + "):" + fibonacci(i));
        }
    }
}
