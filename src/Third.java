import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Third {
    public static void main(String[] args) {
        isPrime();
    }

    private static void isPrime() {
        int k = 0;
        long max = 0;
        long liczba = 600851475143L;
        for (long i = 1; i < 100000000; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    k++;
                }
            }
            if (k == 0) {
                if (liczba % i == 0) {
                    System.out.println(i);
                    max = i;
                }
            } else {
                k = 0;
            }
        } System.out.println(max);
    }
}