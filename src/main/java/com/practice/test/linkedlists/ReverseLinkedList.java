package com.practice.test.linkedlists;

import com.practice.test.dto.Node;

public class ReverseLinkedList {
    public static void main(String[] args) {
        Node head = Node.initNodes(10);

        Node.printAll(head);

        System.out.println("After reverse!");
        printReversed(head);

        Node.printAll(reverse(head));
    }

    public static Node reverse(Node head) {
        Node prev = null;
        while (head != null) {
            Node next = head.getNext();
            head.setNext(prev);
            prev = head;
            head = next;
        }

        return prev;
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
