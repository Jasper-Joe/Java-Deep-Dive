public class Node<T> {
    private T value;
    public Node(T v) {
        value = v;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T v) {
        value = v;
    }
}
