import javax.xml.soap.Node;

public class MyLinkedList<E> {
    private int numNodes = 0;
    private Node head;

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data){
            this.data = data;
        }

        public Object getData(){
            return this.data;
        }
    }

    public MyLinkedList(Object data){
        head = new Node(data);
    }

    public void add(int index, E data){
        Node temp = head;
        Node holder;

        for(int i=0; i < index-1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(E e){
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E e){
        Node temp = head;
        for(int i=0; i < numNodes-1; i++) {
            if (temp.next == null) {
                temp.next = new Node(e);
            }
        }
        numNodes++;
    }

    public E remove(int index){

    }

    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
