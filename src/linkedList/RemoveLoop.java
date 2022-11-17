package linkedList;

public class RemoveLoop {
    static Node head;
    public static int removeLoop(Node head,int x)
    {
        Node curr=head;
        Node temp=head;
        int count=0;
        while(count!=x)
        {
            count++;
            curr = curr.next;
        }
        while(temp!=null)
        {
            if(temp.next.data == curr.data)
            {
                temp.next = null;
                return 1;
            }
        }
        return 0;
    }
    public static void main(String args[])
    {
        RemoveLoop list = new RemoveLoop();
        list.head = new Node(2);
        list.head.next = new Node(3);
        list.head.next.next = new Node(4);
        list.head.next.next.next = list.head.next;
        System.out.println(""+ list.removeLoop(head,2));
    }


}
