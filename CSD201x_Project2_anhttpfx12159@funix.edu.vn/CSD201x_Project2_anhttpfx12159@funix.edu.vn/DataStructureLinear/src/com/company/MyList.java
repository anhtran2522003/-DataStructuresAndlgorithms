package com.company;

/**
 * Generic version of the LinkedList class.
 */
public class MyList {
    /**
     * Head node, default is null
     */
    private Node head;
    /**
     * Tail node, default is null
     */
    private Node tail;

    /**
     * Default constructor
     */
    public MyList() {
    }


    public void setTail(Node tail) {
        this.tail = tail;
    }

    /**
     * Constructor with head and tail
     *
     * @param head Head node of this list
     * @param tail Tail node of this list
     */
    public MyList(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    /**
     * Checking if this list is empty
     *
     * @return true if list is empty
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Returning the length of this list
     *
     * @return The length of this list
     */
    public int length() {
        int i = 0;
        Node curr = head;
        while (curr.getInfo() != null) {
            i++;
            curr = curr.getNext();
        }
        return i;
    }

    /**
     * Insert an item to the head of this list
     *
     * @param item The item to be inserted
     */

    public void insertToHead(Product item) {
    }

    /**
     * Insert an item to the tail of this list
     *
     * @param item The item to be inserted
     */
    public void insertToTail(Node item) {

        if (isEmpty()) {
            tail = item;
            head = tail;
        } else {
            tail.setNext(item);
            tail = item;
        }
    }

    /**
     * Insert an item at position to this list
     *
     * @param position The position of new item
     * @param item     The item to be inserted
     */

    public void insertAfterPosition(int position, Product item) {
    }

    /**
     * Deleting the head of this list
     */
    public void deleteHead() {
        head = head.getNext();
    }

    /**
     * Searching and deleting an item from this list by comparing the ID of items
     *
     * @param item The item to be deleted
     */
    public void deleteElement(Product item) {
    }

    /**
     * Swaping two nodes [firstNode] and [secondNode]
     *
     * @param firstNode
     * @param secondNode
     */

    public void swap(Node firstNode, Node secondNode) {
    }

    /**
     * Deleting all items in the list
     */
    public void clear() {
    }


}
