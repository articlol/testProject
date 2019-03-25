package SuperList;

public class Node<T> {
    Node<T> next;
    Node<T> previous;
    T value;

    public Node(T element) {
        this.value = element;
    }
}
