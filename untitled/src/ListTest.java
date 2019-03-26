import java.util.ArrayList;
import java.util.LinkedList;

public class ListTest {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); // В данной операции (вставка в середину списка) быстрее будет ArrayList
        int n = 2000000;
        int z = 1 + 1;
        for (int i = 0; i < n; i++) {
            list.add(list.size() / 2, z);
        }
    }
}
