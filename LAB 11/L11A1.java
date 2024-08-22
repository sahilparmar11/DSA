public class L11A1 {
    private static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    static class Stack{
        public static Node head = null;
        public static void pushElement(int data){
            Node newNode = new Node(data);

            if(head == null){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static boolean isEmpty(){
            return head == null;
        }

        public static int popElement(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peekElement(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            return top;

        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.pushElement(1);
        s.pushElement(2);
        s.pushElement(3);
        s.pushElement(4);
        s.pushElement(5);

        while(!s.isEmpty()){
            System.out.println(s.peekElement());
            s.popElement();
        }
    }
    
}
