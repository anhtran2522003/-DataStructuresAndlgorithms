package com.company;

import java.util.EmptyStackException;

public class MyStack {
    /**
     * Head node contains front node in the stack
     */
    private Node head;

    public MyStack() {
        head = null;
    }

    public Node getHead() {
        return head;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void push(Product x) {
        head = new Node(x, head);

    }

    Product top() throws EmptyStackException {
        if (isEmpty()) throw new EmptyStackException();

        return (head.getInfo());

    }

    public Object pop() throws EmptyStackException {
        if (isEmpty()) throw new EmptyStackException();

        Product x = head.getInfo();

        head = head.getNext();

        return (x);

    }
}
