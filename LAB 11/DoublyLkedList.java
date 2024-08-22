class LinkedList {
    class Node {
        int data;
        Node rptr;
        Node lptr;

        Node(int data) {
            this.data = data;
            this.lptr = null;
            this.rptr = null;
        }
    }

    public Node left;
    public Node right;

    public void insertFirst(int data) {
        Node newNode = new Node(data);
        if (left == null) {
            left = newNode;
        } else {
            newNode.rptr = left;
            left.lptr = newNode;
            newNode = left;
        }
    }

    public void insertLast(int data) {
        Node newNode = new Node(data);
        if (left == null) {
            left = newNode;
        } else {
            Node current = left;

            while (current.rptr != null) {
                current = current.rptr;
            }
            current.rptr = newNode;
            newNode.lptr = current;

        }
    }

    public void deleteAtSpecificPos(int position) {
        if (left == null) {
            System.out.println("Can't delete");
        } else {
            Node current = left;
            int pos = 0;
            while (current.rptr != null && pos < position) {
                current = current.rptr;
                pos++;
            }
            if (pos == position) {
                if (current == left) {
                    left = left.rptr;
                    left.lptr = null;
                } else if (current == right) {
                    right = right.lptr;
                    right.rptr = null;
                } else {
                    current.lptr.rptr = current.rptr;
                    current.rptr.lptr = current.lptr;
                }

            } else {
                System.out.println("Doesn't exist");
            }

        }
    }

    public void display() {
        if (left == null) {
            System.out.println("Empty");
        } else {
            Node current = left;
            while (current != null) {
                System.out.println(current.data + "->");
                current = current.rptr;
            }
            System.out.println("null");
        }
    }

}
public class DoublyLkedList{
    public static void main(String[] args) {
        System.out.println("En");
    }
}