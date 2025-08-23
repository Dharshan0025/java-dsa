package LinkedListPractice;

public class LinkedList {
    Node head;
    LinkedList(){
      head=null;
    }
    public class Node{
        int data;
        Node next;
        Node(int val){
          data=val;
          next=null;
        }
    }
    public void insertAtBeginning(int val){
       Node newNode=new Node(val);
       if(head==null){
        head=newNode;
       }else{
        newNode.next=head;
        head=newNode;
       }
    }
    public void display(){
        if(head==null){
          System.out.println("empty linked list");
        } else{
          Node temp=head;
          while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
          }
        }
    }
    public void insertAtpos(int pos,int val){
           Node newNode=new Node(val);
           Node temp=head;
           for(int i=0;i<pos;i++){
            temp=temp.next;
           }
           newNode.next=temp.next;
           temp.next=newNode;

    }

}
