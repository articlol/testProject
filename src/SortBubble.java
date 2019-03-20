import java.util.Arrays;

public class SortBubble {
    public static void main(String[] args) {
        System.out.println(sortBubble(new int[] {3, 5, 10, 2, 33, 30, 1}));
        }
    public static int sortBubble(int[] list){
        for (int i = 0; i < list.length; i++) {
            for (int j = list.length - 1; j > i; j--) {
                if (list[j] < list[j - 1]) {
                    int x = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = x;
                }
            }
        }
    }
}
