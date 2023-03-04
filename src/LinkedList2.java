import java.util.LinkedList;
import java.util.List;

public class LinkedList2 {

    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);

        System.out.println(linkedList);
        System.out.println(linkedList.get(0));

        System.out.println(linkedList.size());
    }
}
