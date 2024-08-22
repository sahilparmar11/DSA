class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {

    Node head;

    public CircularLinkedList() {
        this.head = null;
    }

    public int countNodes() {
        int count = 0;
        if (head == null) {
            return count;
        }
    
        Node current = head;
    
        do {
            count++;
            current = current.next;
        } while(current != head);
    
        return count;
    }
    
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
        }
    }
}

public class CountNodeInCirculerList {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        System.out.println("Number of nodes in the circular linked list: " + list.countNodes());
    }
}
