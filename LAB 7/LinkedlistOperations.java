public class LinkedlistOperations{
    Node head;

    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;

    }

    public void printList(){
        if(head == null){
            System.out.println("Stack Underflow");
            return;
        }

        Node currentNode = head;
        while(currentNode != null){
            System.out.println(currentNode.data + "-->");
            currentNode = currentNode.next;
        }
        System.out.println("NULL");

    }
    

    public static void main(String[] args) {
        LinkedlistOperations list = new LinkedlistOperations();
        list.addFirst(11);

        list.addLast(12);

        list.printList();
        

    }
}
