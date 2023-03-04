public class Second {
    public static void main(String[] args) {
        System.out.println(findFib());
    }

    private static long findFib() {
        long fib1 = 1L;
        long fib2 = 2L;
        long sum = 2L;
        while(fib2<4000_000) {
            long fib_next = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib_next;
            if (fib_next % 2 == 0) sum+=fib_next;

        }
        return sum;
    }
}
