package Java.src.LinkedList;

public class Main {

    public static void main(String[] args) {
        
        Linkedlist list = new Linkedlist();

        list.insert(4);
        list.insert(5);
        list.insert(20);
        list.insert(56);
        list.insert(59);
        list.insertAt(0, 34);
        list.delelteAt(2);
        list.delelteAt(5);
        //test

        list.show();
    }
}
