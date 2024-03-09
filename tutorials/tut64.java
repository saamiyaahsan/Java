// Implementation of singlyLinkedList

public class singlyLinkedList{
    class Node{
        Node next;
        int data;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
        }

        else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void display(){
        Node current = head;

        if(head == null){
            System.out.println("The list is empty");
        }

        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args){
        singlyLinkedList slist = new singlyLinkedList();
        slist.addNode(1);
        slist.addNode(2);
        slist.addNode(3);
        slist.addNode(4);

        slist.display();
    }
}
