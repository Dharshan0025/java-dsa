class LinkedList{

   Node head;
   public class Node{
      int data;
      Node next;
      Node(int data){
        this.data=data;
        this.next=null;
      }
    }
    public void insertAtBegin( int data){
        Node n1=new Node(data);
        if(head==null){
            head=n1;
        }else{
            n1.next=head;
            head=n1;
        }
    }
    public void display(){
        Node curr=head;
        while(curr!=null){
            System.out.println(curr.data+" ");
            curr=curr.next;
        }
    }
    public void insertPos(int data, int pos){
        int count=0;
        Node n1=new Node(data);
        Node curr=head;
        while(curr!=null && count<pos-1){
            curr=curr.next;
            count++;
        }
        if(curr==null){
            System.out.println("position out of bound");
        } else{
            n1.next=curr.next;
            curr.next=n1;
        }
    }
    public void deleteNode(int data){
        Node curr=head;
        Node prev=curr;
        if (head == null) {
          System.out.println("List is empty");
        return;
        }
        if(curr.data==data){
            head=curr.next;
            return;
        }
        while(curr!=null){
            if(curr.data==data){
              prev.next=curr.next;
              return;
            }
            prev=curr;
            curr=curr.next;
        }

    }
}

