package linkedList;

public class RemoveLoop {
    static Node head;
    public static int removeLoop(Node head,int x)
    {
        Node curr=head;
        Node temp=head;
        Node curr1 = head;
        Node temp1 = head;
        int count =0;
        while(count<=x)
        {
            count++;
            curr = curr.next;
        }
        curr1 = curr;
        while(temp.next!=curr1)
        {
                temp = temp.next;
        }
        temp1 =  temp;
        if(temp1.next==curr1)
        {
            temp1.next=null;
            return 1;
        }
        return 0;
    }
    public static void main(String args[])
    {
        RemoveLoop list = new RemoveLoop();
        list.head = new Node(2);
        list.head.next = new Node(3);
        list.head.next.next = new Node(4);
        System.out.println(removeLoop(list.head,2));
    }
}
