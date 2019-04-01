import sun.plugin.javascript.navig.Array;

import java.util.Arrays;
import java.util.List;

public class StremAPI {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(23, 41, 11, 67, 3, -5, 117, 0, -101, 82);
        Integer min = number.stream()
                            .reduce(Integer.MAX_VALUE, Integer::min);
        System.out.println(min);
    }
}
