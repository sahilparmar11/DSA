class CirculerLinkedList{
    Node head;

    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void deleteNode(int data){
        if(head == null){
            System.out.println("Circuler List is empty.Deletion is Not possible...");
            return;
        }

        Node current = head, prev = null;

        while(current.data!=data){
            if(current.next == head){ // traverse list
                System.out.println("Node is not Found...");
            }
            prev = current;
            current = current.next;
        }

        if(current.next == head){ // single node in list
            head = null;
        }
        else if(current == head){ // if we want to delete head node
            Node temp = head;
            while(temp.next!=head){
                temp = temp.next;
            } // in last temp ma last node aavse
            head = head.next; // head delete thyo etle new head
            temp.next = head; // last.next = head
        }
        else{
            prev.next = current.next; // skip current means prev.next reffer to current
        }
    }

    
}
public class DeleteFromCirculerList {
    public static void main(String[] args) {
        CirculerLinkedList list = new CirculerLinkedList();
        list.deleteNode(3);
    }
}
