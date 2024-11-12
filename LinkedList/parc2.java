//Take elements(numbers in the range of 1-50) of
// a Linked List as input from the user. Delete
// all nodes which have values greater than 25.


public class parc2 {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //addLast
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;

        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;

    }

    //To display
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;

        while (currNode != null) {
            System.out.println(currNode.data + " ");
            currNode = currNode.next;
        }
    }

    public void greaterThan25() {
    while(head !=null && head.data>25);{
        head=head.next;
        }

        currNode=head;

    }



    
}
