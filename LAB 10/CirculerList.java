import java.util.Scanner;

class CiculerlinkedList {
    Node first;
    Node last;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertFirst(int data) {
        Node newNode = new Node(data);

        if (first == null) {
            newNode.next = newNode;
            first = newNode;
            last = newNode;
        } else {
            newNode.next = first;
            last.next = newNode;
            first = newNode;
        }
    }

    public void insertLast(int data) {
        Node newNode = new Node(data);

        if (first == null) {
            newNode.next = newNode;
            first = newNode;
            last = newNode;
        } else {
            newNode.next = first;
            last.next = newNode;
            last = newNode;
        }
    }

    public void insertRandom(int data) {
        Node newNode = new Node(data);

        if (first == null) {
            newNode.next = newNode;
            first = newNode;
            last = newNode;
        }

        if (newNode.data <= first.data) {
            newNode.next = first;
            last.next = newNode;
            first = newNode;
        }

        Node current = first;

        while (current != last && newNode.data >= first.data) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;

        if (current == last) {
            last = newNode;
        }
    }
}

public class CirculerList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CiculerlinkedList c = new CiculerlinkedList();
        // int data = sc.nextInt();

        int n = 0;
        while (n != 4) {
            System.out.println("\nEnter 1 to insertfirst");
            System.out.println("Enter 2 to insertlast");
            System.out.println("Enter 3 to insertrandom");
            System.out.println("Enter 4 to exit");
            System.out.print("Enter your choice: ");
            n = sc.nextInt();

            switch (n) {
                case 1:
                    System.out.println("Insert First number");
                    int data = sc.nextInt();
                    c.insertFirst(data);
                    break;
                case 2:
                System.out.println("Insert at last");
                    int data1 =sc.nextInt();
                    c.insertLast(data1);
                    break;
                case 3:
                int data2 =sc.nextInt();
                    c.insertRandom(data2);
                    break;

                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
        sc.close();
    }
}
