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

    public void addRandom(int data){
        Node newNode = new Node(data);
        if(head==null || newNode.data<=head.data){
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next!=null && newNode.data>=current.next.data) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;

    }

    public void deleteFirst(){
        if(head==null){
            System.out.println("Stack Underflow");
            return;
        }

        head = head.next; // 2nd node ne head banvsi etle 1st remove
    }

    public void deleteLast(){
        if(head==null){
            System.out.println("Stack Underflow");
            return;
        }
        if(head.next==null){ // if linkedlist has only one element
            head = null; // delete
        }
        Node secondLastNode = head;
        Node lastNode = head.next; // head.next = null --> lastNode = null

        while(lastNode.next!=null){ // if lastnode next hase to lastnode nu next error apse
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = null; // secondlast na next ne null karavathi last delete thy jase


    }

    public int countNode(){
        int count = 0;
        if(head == null){
            count = 0;
            return count;
            
        }
        Node current = head;
        while(current.next!=null){
            current = current.next;
            count++;
        }
        return count;

    }

    public void printList(){
        if(head == null){
            System.out.println("Stack Underflow");
            return;
        }

        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + "-->");
            currentNode = currentNode.next;
        }
        System.out.println("NULL");

    }
    
    public void reverseList(){
        if(head == null || head.next == null){
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;

        while(currNode!=null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            //update
            prevNode = currNode;
            currNode = nextNode;                                            
        }
        head.next = null;
        head = prevNode;
    }

    public static void main(String[] args) {
        LinkedlistOperations list = new LinkedlistOperations();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        // list.addFirst(11);

        // list.addLast(12);

        // list.addRandom(4)
        // ;
        // list.deleteFirst();

        // list.deleteLast();

        list.printList();
        list.reverseList();
        list.printList();
        

    }
}