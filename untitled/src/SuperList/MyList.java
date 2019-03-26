package SuperList;

import java.util.AbstractList;

public class MyList<T> extends AbstractList<T> {

    private int size = 0;
    private Node<T> first;
    private Node<T> middle;
    private Node<T> last;

    public MyList() {
        first = middle = last = null;
    }

    @Override
    public boolean add(T element) {
        Node<T> newNode = new Node<>(element);

        if (first == null) {
            newNode.next = null;
            newNode.previous = null;
            first = newNode;
            middle = newNode;
            last = newNode;
        } else {                                      // иначе в конец добавлякм новую ноду и меняем ссылки
            last.next = newNode;
            newNode.previous = last;
            last = newNode;

            //Если было чётное число элементов, а теперь нечетное, то Мидлом становится следующий элемент.
            //Если было нечётное, а теперь чётное, то остаётся этот.
            if (size % 2 == 0) {
                middle = middle.next;
            }
        }
        size++;
        return true;
    }

    public void addMid(T element) {
        Node<T> newMiddle = new Node<>(element);
        if (middle != null) {
            if (size % 2 == 0) {                      //если чётное, то добавляем вправо от старой середины
                newMiddle.previous = middle;
                newMiddle.next = middle.next;
                if (middle.next != null) {            // если следующий элемент существует, то
                    middle.next.previous = newMiddle;
                }
                middle.next = newMiddle;
                middle = newMiddle;
            } else {                                 //если нечётное, то добавляем влево
                newMiddle.next = middle;
                newMiddle.previous = middle.previous;
                if (middle.previous != null) {       // если предыдущий элемент существует, то
                    middle.previous.next = newMiddle;
                } else {                             // иначе если не существует, то это и есть первый
                    first = newMiddle;
                }
                middle.previous = newMiddle;
                middle = newMiddle;
            }
            size++;
        } else {
            add(element);
        }
    }

    public T get(int index) {
        Node<T> node = getNode(index);
        return node.value;
    }

    Node<T> getNode(int index) {                      // начинаем с first, дальше итерируемся через next
        if (index == 0) {
            return first;
        }
        Node<T> result = first;
        for (int i = 1; i <= index; i++) {
            result = result.next;
        }
        return result;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}

