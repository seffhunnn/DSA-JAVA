public class reverseLL {
    Node head;
    private int size;

    reverseLL() {
        this.size = 0;
    }

    class Node {
        int data;   // Changed to int
        Node next;

        Node(int data) {   // Now accepts an int argument
            this.data = data;
            this.next = null;
        }
    }

    // Add - first
    public void addFirst(int data) {   // Now accepts int
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add - last
    public void addLast(int data) {   // Now accepts int
        Node newNode = new Node(data);
        size++;
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

    // Print
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    // Delete first
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
    }

    // Delete last
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public int getSize() {
        return size;
    }

    public void reverseIterate(){
        if(head==null || head.next==null){
            return;
        }

        Node prevNode= head;
        Node currNode=head.next;

        while(currNode != null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;

            //update
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
    }




    public static void main(String[] args) {
        reverseLL list = new reverseLL();
        list.addLast(1);   // Adding integers
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        list.printList();

        list.reverseIterate();
        list.printList();


        System.out.println("Size: " + list.getSize());
    }
}
