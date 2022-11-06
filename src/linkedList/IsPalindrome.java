package linkedList;

public class IsPalindrome {
    static Node head;
    static boolean isPalindrome(Node head)
    {
        Node curr = head;
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = reverseList(slow.next);
        slow = slow.next;
        while(slow!= null & curr!=slow)
        {
            if(slow.data != curr.data)
            {
                return false;
            }
            curr = curr.next;
            slow = slow.next;
        }
        return true;
    }
    static Node reverseList(Node head)
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
    public static void main(String[] args)
    {
        IsPalindrome list = new IsPalindrome();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(2);
        list.head.next.next.next = new Node(2);
        list.head.next.next.next.next = new Node(1);
        System.out.println(" " + isPalindrome(list.head));
    }

}
