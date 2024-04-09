public class Fibonacci {
    public static void main(String[] args) {
        int limit = 10; // Change this to generate Fibonacci series up to a different limit
        int a = 0, b = 1;

        System.out.println("Fibonacci Series up to " + limit + ":");
        System.out.print(a + " " + b + " ");

        for (int i = 2; i < limit; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}

