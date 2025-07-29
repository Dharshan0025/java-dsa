public class Main{
  public static void main(String[] args) {
    LinkedList list=new LinkedList();
    list.insertAtBegin(20);
    list.insertAtBegin(30);
    list.insertAtBegin(40);
    list.insertAtBegin(50);
    list.insertAtBegin(60);
    list.insertPos(10,2);
    list.deleteNode(10);
    list.deleteNode(60);
    list.display();
  }
}