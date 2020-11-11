public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Integer> test = new MyLinkedList<>(1);
        test.addFirst(2);
        test.add(1,4);
        test.addLast(3);
        test.printList();
    }
}
