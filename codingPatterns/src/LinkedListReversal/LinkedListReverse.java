package LinkedListReversal;

public class LinkedListReverse {

    Node head;

    public void reverseList(int[] arr) {
        for (int no : arr) {
            insertList(no);
        }

        // reverse the list  1 - 2 - 3 - 4 - 5
        Node next;
        Node previous = null;
        Node current;
        current = head;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        while (previous != null) {
            System.out.print(previous.no + " ");
            previous = previous.next;
        }

    }

    public void insertList(int no) {
        if (head == null) {
            head = new Node(no);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(no);
        }
    }

    private class Node {
        public Node next;
        public int no;

        Node(int no) {
            this.no = no;
        }
    }
}
