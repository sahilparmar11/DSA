import java.util.Scanner;

public class L9A1 {
    static class Queue {
        private int arr[];
        private int size;
        private int rear;

        Queue(int m) {
            arr = new int[m];
            this.size = m;
            this.rear = -1;
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        public boolean isFull() {
            return rear == size - 1;
        }

        public void enqueue(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear] = data;
            System.out.println(data + " enqueued to queue.");
        }

        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Underflow");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            System.out.println(front + " dequeued from queue.");
            return front;
        }

        public int front() {
            if (isEmpty()) {
                System.out.println("Underflow");
                return -1;
            }
            return arr[0];
        }

        public void display() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            System.out.print("Queue: ");
            for (int i = 0; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of queue: ");
        int m = sc.nextInt();

        Queue q = new Queue(m);

        int n = 0;
        while (n != 5) {
            System.out.println("\nEnter 1 to enqueue");
            System.out.println("Enter 2 to dequeue");
            System.out.println("Enter 3 to peek front");
            System.out.println("Enter 4 to display queue");
            System.out.println("Enter 5 to exit");
            System.out.print("Enter your choice: ");
            n = sc.nextInt();

            switch (n) {
                case 1:
                    System.out.print("Enter number to add in queue: ");
                    int data = sc.nextInt();
                    q.enqueue(data);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    int front = q.front();
                    if (front != -1) {
                        System.out.println("Front of queue: " + front);
                    }
                    break;
                case 4:
                    q.display();
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
        sc.close();
    }
}
