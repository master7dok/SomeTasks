import java.util.Scanner;

public class For {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if(a>b) System.out.println("Error of enter");
        else {
            for (int i = a; i < b; i++) {

                if ((i % 5 == 0) && (i % 10 != 0))
                    System.out.println(i);
            }
        }
    }
}
