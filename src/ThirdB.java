public class ThirdB {
    public static void main(String[] args) {
        long n = 600851475143L;
        int i;
        for (i = 2; i <= n / i; i++) {
            while (n % i == 0) n /= i;
        }
        System.out.println("Largest prime factor of 600851475143: " + n);
    }
}