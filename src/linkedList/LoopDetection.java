package linkedList;
    class Node
    {
        int data;
        Node next;
        Node(int x)
        {
            data=x;
            next = null;
        }
    }
    public class LoopDetection {
        static Node head;
        LoopDetection()
        {
            head = null;
        }
        public static int loopDetection(Node head)
        {
            Node slow = head;
            Node fast = head;
            while(slow!= null && fast!=null && fast.next!=null)
            {
                slow = slow.next;
                fast = fast.next.next;
                if(slow==fast)
                {
                    return 1;
                }
            }
            if(slow==fast)
            {
                return 1;
            }
            return -1;
        }
        public static void main(String[] args)
        {
            LoopDetection list = new LoopDetection();
            list.head = new Node(1);
            list.head.next = new Node(2);
            list.head.next.next = new Node(3);
            list.head.next.next.next = new Node(4);
            list.head.next.next.next.next =new Node(7);
            System.out.println(loopDetection(head));
        }

    }
    
