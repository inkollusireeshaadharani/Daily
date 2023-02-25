package linkedlist;

public class CLL {

    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val) {
        Node node = new Node(val);
        if (head == null) {//IF LIST IS EMPTY
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display() {//DISPLAY THE LIST
        Node node = head;
        if (head != null) {//IF LIST IS NOT EMPTY
        	//using the do while loop to execute the loop at least once for head and 
        	//update the pointer until we reach the head again
            do {
                System.out.print(node.val + " -> ");
                if (node.next != null) 
                {
                	node = node.next;
                }
            } while (node != head);
        }
        System.out.println("HEAD");
    }

    public void delete(int val) {
        Node node = head;
        if (node == null) {//LIST IS EMPTY
            return;
        }

        if (head == tail){//ONLY ONE ELEMENT
            head = null;
            tail = null;
            return;
        }

        if (node.val == val) {//DELETING HEAD
            head = head.next;
            tail.next = head;
            return;
        }
        //ANY OTHER ELEMENT
        do {
            Node nextNode = node.next;
            if (nextNode.val == val) {
                node.next = nextNode.next;
                break;
            }
            node = node.next;
        } while (node != head);

    }

    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
}