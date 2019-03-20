import java.util.Scanner;
import java.util.Arrays;

public class SearchBinary {
    public static void main(String[] args) {
        System.out.println(searchBinary(new int[]{1, 3, 4, 6, 19, 21, 30, 44}, 4));
    }

    public static int searchBinary(int[] x, int findX) {
        int low = 0;
        int high = x.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (findX < x[mid]) {
                high = mid - 1;
            } else if (findX > x[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return 0;
    }
}

