import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        java.util.ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 20; i+=2) {
            arr.add(i);
        }
        System.out.println(arr);
        arr.remove(1);
        System.out.println(arr);

    }
}
