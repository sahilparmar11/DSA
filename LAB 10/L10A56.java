class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;

    }
}

public class L10A56 {
    public static void main(String[] args) {
        Node n1 = new Node(20);
        System.out.println("Data in node: "+n1.data);

    }
}
