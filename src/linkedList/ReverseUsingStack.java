package linkedList;

import java.util.Stack;

public class ReverseUsingStack {
    static Node head;
    static void add(int data) {
        Node curr = new Node(data);
        if (head == null) {
            head = curr;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = curr;
        }

    }

    static Node reverseList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Stack<Node> s = new Stack<Node>();
        Node curr = head;
        while (curr.next!= null) {
            s.push(curr);
            curr= curr.next;
        }
        head =curr;
        while (!s.isEmpty()) {
            curr.next= s.peek();
            curr=curr.next;
            s.pop();
        }
        curr.next = null;
        return head;
    }
    static void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }

    public static void main(String args[]) {
        ReverseUsingStack list = new ReverseUsingStack();
        list.head = new Node(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.head=reverseList(list.head);
        printList(list.head);
    }

}