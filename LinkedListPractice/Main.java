package LinkedListPractice;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtBeginning(9);
        list.insertAtBeginning(8);
        list.insertAtBeginning(7);
        list.insertAtBeginning(6);
        list.insertAtBeginning(5);
        list.insertAtpos(2,4);
        list.display();
    }
}
