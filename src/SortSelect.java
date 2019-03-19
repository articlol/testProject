public class SortSelect {
    public static void main(String[] args) {
        int[] a = {40, 30, 2, 14, 5, 16, 2, 46, 17, 87, 29, 43, 11, 1};
        for (int i = 0; i < a.length; i++) {
            int min = a[i];
            int i_min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < min) {
                    min = a[j];
                    i_min = j;
                }
            }
            if (i != i_min) {
                int t = a[i];
                a[i] = a[i_min];
                a[i_min] = t;
            }
            System.out.println(a[i]);
        }
    }
}
