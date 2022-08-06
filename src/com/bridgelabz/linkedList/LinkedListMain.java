package com.bridgelabz.linkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList1 = new LinkedList<>();

        linkedList1.push(70);
        linkedList1.push(30);
        linkedList1.push(56);
        linkedList1.print();

        linkedList1.insertAfter(30,40);
        linkedList1.print();

        linkedList1.popElement(40);
        System.out.println("Size of Linked List: " + linkedList1.size());
    }
}
