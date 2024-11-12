//Make a Linked List & add the following elements
// to it : (1, 5, 7, 3 , 8, 2, 3). Search for the
// number 7 & display its index.

public class prac1 {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //To add element in last
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

    //To display elements
    public void display(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node currNode=head;

        while(currNode!=null){
            System.out.print(currNode.data+" ");
            currNode=currNode.next;
        }
    }

    //To search
    public int Search(int key){
        if(head==null){
            System.out.println("List is empty");
        }
        Node currNode=head;
        int index=0;

        while(currNode!=null){
            if(currNode.data==key){
                return index;
            }
            currNode=currNode.next;
            index++;
        }
        return-1;
    }

    public static void main(String[] args){
        prac1 list= new prac1();
        list.addLast(1);
        list.addLast(5);
        list.addLast(7);
        list.addLast(3);
        list.addLast(8);
        list.addLast(2);
        list.addLast(3);
        list.display();
        System.out.println();

        System.out.println(list.Search(8));
    }


}




