package linkedList;

public class RemoveLoop2 {
    static Node head;
    public static void removeLoop(Node head)
    {
        Node slow = head;
        Node fast = head;
        Node temp = head;
        Node curr = head;
        while(slow!=null && fast!= null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast)
            {
                temp = slow;
            }
        }
        while(temp.next != curr.next)
        {
            temp = temp.next;
            curr = curr.next;
        }
        temp.next=null;
    }
    public static void printList(Node head)
    {
        Node curr = head;
        while(curr!=null)
        {
            System.out.println(""+curr.data);
            curr = curr.next;
        }
    }

    public static void main(String args[])
    {
        RemoveLoop2 list = new RemoveLoop2();
        list.head = new Node(2);
        list.head.next = new Node(3);
        list.head.next.next = new Node(4);
       // list.head.next.next.next = list.head;// testing the method
        printList(head);
    }
}
