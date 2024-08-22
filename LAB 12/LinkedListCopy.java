class ListNode {
    int value;
    ListNode next;

    ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}
public class LinkedListCopy {

    public static ListNode copyLinkedList(ListNode head) {
        if (head == null) {
            return null; 
        }


        ListNode newHead = new ListNode(head.value);
        ListNode newCurrent = newHead;
        ListNode originalCurrent = head.next;

        while (originalCurrent != null) {
            newCurrent.next = new ListNode(originalCurrent.value);
            newCurrent = newCurrent.next;
            originalCurrent = originalCurrent.next;
        }

        return newHead; 
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode originalHead = new ListNode(1);
        originalHead.next = new ListNode(2);
        originalHead.next.next = new ListNode(3);

        System.out.println("Original list:");
        printList(originalHead);

        ListNode copiedHead = copyLinkedList(originalHead);

        System.out.println("Copied list:");
        printList(copiedHead);
    }
}
