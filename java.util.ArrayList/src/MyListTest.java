public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<Integer>();
        myList.add(0,5);
        myList.add(1,4);
        myList.add(2,3);
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(2,6);
        myList.remove(1);
        myList.display();
    }
}
