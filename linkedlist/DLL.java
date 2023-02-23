package linkedlist;

public class DLL {
	private Node head;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void display() {
        Node node = head;
        Node last = null;//just like int i=0; creating a temp variable that points to 0
        while (node != null) {
            System.out.print(node.val + " -> ");
            last = node;//without this line it is the same as SLL
            node = node.next;
        }
        System.out.println("END");
        
        System.out.println("Print in reverse");
        while (last != null) {
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        Node last = head;

        node.next = null;//irrespective of the code

        if (head == null) {//when the list is empty
            node.prev = null;
            head = node;//the node itself is the head 
            return;//dont have to perform the next steps
            //we can also use if else but this is more meaningful
        }

        while (last.next != null) {
            last = last.next;
        }

        last.next = node;
        node.prev = last;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.val == value) {
                return node;
            }
            node = node.next;//dont forget the updation
        }
        return null;//edge case
    }

    public void insert(int after, int val) {
        Node p = find(after);

        if (p == null) {//edge case
            System.out.println("does not exist");
            return;
        }

        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null) {//true when the element is inserted at end
            node.next.prev = node;
        }
    }

    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

//        public Node(int val, Node next, Node prev) {
//            this.val = val;
//            this.next = next;
//            this.prev = prev;
//        }
    }
	
}
