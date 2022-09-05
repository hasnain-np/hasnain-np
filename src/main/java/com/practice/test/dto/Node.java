package com.practice.test.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Node {
    private Node next;
    private int value;

    public Node(int val) {
        this.value = val;
    }

    public static void printAll(Node head) {
        while (head != null) {
            System.out.print(head.getValue() + " -> ");
            head = head.next;
        }

        System.out.println("null");
    }

    public static Node initNodes(int len) {
        if (len < 1)
            return null;

        Node head = new Node(0);
        final Node headBk = head;
        for (int i = 1; i < len; i++) {
            head.setNext(new Node(i));
            head = head.getNext();
        }

        return headBk;
    }
}
