package linkedList;
public class ReverseTheList {
    static Node head;
    public static Node reverseTheList(Node head)
    {
        Node prev = null;
        Node nextNode= null;
        Node curr = head;
        while(curr!=null)
        {
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        head = prev;
        return prev;
    }
    static void printList(Node head)
    {
        Node curr = head;
        while(curr != null)
        {
            System.out.println(" " + curr.data);
            curr = curr.next;
        }
    }
    public static void main(String[] args)
    {
        ReverseTheList list = new ReverseTheList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(5);
        list.head=list.reverseTheList(list.head);
        list.printList(head);
    }

}
