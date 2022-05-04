package com.company;

/**
 * Generic version of the Queue class.
 */
public class MyQueue {
    /**
     * Head node contains front node in the queue
     */
    private Node head;
    /**
     * Tail node contains last node in the queue
     */
    private Node tail;

    public MyQueue() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    Product front() throws Exception {
        if (isEmpty()) throw new Exception();

        return (head.getInfo());

    }

    public Object dequeue() throws Exception {
        if (isEmpty()) throw new Exception();
        Object x = head.getInfo();
        head = head.getNext();
        if (head == null) tail = null;
        return (x);
    }

    void enqueue(Product x) {
        if (isEmpty()) {
            head = tail = new Node(x);
        } else {
            tail.setNext(new Node(x));
            tail = tail.getNext();
        }
    }

    public Node getHead() {
        return head;
    }
}