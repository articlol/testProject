public class SortSelect {
    public static void main(String[] args) {
        System.out.println(sortSelect(new int[] {40, 30, 2, 14, 5, 16, 2, 46, 17, 87, 29, 43, 11, 1}));

    }
    public static int sortSelect(int[] list){
        for (int i = 0; i < list.length; i++) {
            int min = list[i];
            int i_min = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < min) {
                    min = list[j];
                    i_min = j;
                }
            }
            if (i != i_min) {
                int t = list[i];
                list[i] = list[i_min];
                list[i_min] = t;
            }
            System.out.println(list[i]);
        }
    }
}
