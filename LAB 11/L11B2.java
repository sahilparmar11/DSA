
class Node {
    int data;
    Node next; 

  
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    private Node front; 
    private Node rear; 

    public Queue() {
        this.front = null;
        this.rear = null;
    }


    public boolean isEmpty() {
        return front == null;
    }

  
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println(data + " enqueued to queue");
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int dequeuedValue = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return dequeuedValue;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return front.data;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        Node current = front;
        System.out.print("Queue: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class L11B2 {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        queue.display(); // Queue: 10 20 30 40

        System.out.println("Dequeued element: " + queue.dequeue()); // Dequeued element: 10
        System.out.println("Front element: " + queue.peek()); // Front element: 20

        queue.display(); // Queue: 20 30 40
    }
}
