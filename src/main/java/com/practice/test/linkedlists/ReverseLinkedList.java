package com.practice.test.linkedlists;

import com.practice.test.dto.Node;

public class ReverseLinkedList {
    public static void main(String[] args) {
        Node head = Node.initNodes(10);

        Node.printAll(head);

        System.out.println("After reverse!");
//        printReversed(head);

//        Node.printAll(reverse(head));
        Node.printAll(reverseRecursion(head, null));
    }

    public static Node reverseLoop(Node head) {
        Node prev = null;
        while (head != null) {
            Node next = head.getNext();
            head.setNext(prev);
            prev = head;
            head = next;
        }

        return prev;
    }

    public static Node reverseRecursion(Node head, Node prev) {
        if (head == null ) {
            return prev;
        }

        Node next = head.getNext();
        head.setNext(prev);

        return reverseRecursion(next, head);
    }

    public static void printReversed(Node head) {
        if (head == null) {
            return;
        }

        if (head.getNext() != null) {
            printReversed(head.getNext());
        }

        System.out.print(head.getValue() + " -> ");
    }
}
