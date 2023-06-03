public class Solution {
    Node head;

    public class Node {
        int Data;
        Node next;

        Node(int val) {
            this.Data = val;
        }
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            return;
        }
        node.next = head;
        head = node;
    }

    public void insertAt(int val, int loc) {
        // Node node = new Node(val);
        if (loc == 1) {
            insertFirst(val);
            return;
        }
        if (loc > Size()) {
            System.out.println("List Does Not Contain Index " + loc);
            return;
        } else {
            Node temp = head;
            int index = 1;
            while (index < loc) {
                temp = temp.next;
                index++;
            }
            Node node = new Node(val);
            node.next = temp.next;
            temp.next = node;
            return;
        }
    }

    public void deleteAt(int loc) {
        // Node node = new Node(val);
        if (loc == 0) {
            head = head.next;
            return;
        }
        if (loc >= Size()) {
            System.out.println("List Does Not Contain Index " + loc);
            return;
        } else {
            Node temp = head;
            int index = 1;
            while (index < loc) {
                temp = temp.next;
                index++;
            }
            temp = temp.next.next;
            return;
        }
    }

    public int Size() {
        Node temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }

    public void printAll() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.Data + "->");
            temp = temp.next;
        }
        System.out.print("End");
        return;
    }

    public static void main(String[] args) {
        Solution ll = new Solution();
        ll.insertFirst(0);
        ll.insertFirst(12);
        ll.insertFirst(14);
        ll.insertFirst(15);
        ll.printAll();
        System.out.println();
        ll.deleteAt(3);
        ll.printAll();
    }
}
