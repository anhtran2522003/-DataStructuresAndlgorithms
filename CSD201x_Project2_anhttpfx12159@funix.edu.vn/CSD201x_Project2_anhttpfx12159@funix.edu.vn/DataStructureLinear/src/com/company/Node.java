package com.company;

/**
 * Generic version of the Node class.
 */
public class Node {
    /**
     * The info of this node
     */
    private Product info;

    public Product getInfo() {
        return info;
    }

    public void setInfo(Product info) {
        this.info = info;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    private Node next;

    /**
     * Default constructor
     */
    public Node() {
    }

    /**
     * Constructor with info and next node
     *
     * @param info The info of this node
     * @param next The next Node of this node
     */
    public Node(Product info, Node next) {
        this.info = info;
        this.next = next;
    }

    public Node(Product info) {
        this.info = info;
        this.next = null;
    }

    /**
     * Overriding to convert this node to String
     */
    @Override
    public String toString() {
        return info.toString();
    }


}
