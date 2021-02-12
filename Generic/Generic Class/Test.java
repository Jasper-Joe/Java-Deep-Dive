public class Test {
    public static void main(String[] args) {
        Node<String> node1 = new Node<>("testing");
        Node<Integer> node2 = new Node<>(88);
        System.out.println(node1.getValue());
        System.out.println(node2.getValue());
        node2.setValue(99);
        System.out.println(node2.getValue());


    }


}
