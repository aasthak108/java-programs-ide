package linkedList;

public class NthNodeFromLast {
    static Node head;
    static void add(int data)
    {
        Node curr=new Node(data);
        if(head==null)
        {
            head=curr;
        }
        else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=curr;
        }
    }
    public static int nthNodeFromLast(Node head,int n)
    {
        int count=0;
        int length=0;
        Node curr = head;
        Node temp = head;
        while(curr!=null)
        {
            length++;
            curr = curr.next;
        }
        System.out.println(" length " + length);
        while(count<length-n)
        {
            temp = temp.next;
            count++;
        }
        System.out.println(" count " + count);
        return temp.data;
    }
    public static void main(String[] args)
    {
        NthNodeFromLast list = new NthNodeFromLast();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(nthNodeFromLast(list.head,7));
    }

}