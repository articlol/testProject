package SuperList;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();

        int n = 100;
        for (int i = 0; i < n; i++) {
            list.addMid(i);
        }
        System.out.println("middle element = " + list.get(list.size() / 2) + " middle index = " + list.size() / 2);
    }
}
