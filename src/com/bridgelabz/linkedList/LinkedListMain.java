package com.bridgelabz.linkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList1 = new LinkedList<>();
//        linkedList1.push(70);
//        linkedList1.push(30);
//        linkedList1.push(56);
//        linkedList1.print();
//        System.out.println();
//
//        LinkedList<Integer> linkedList2 = new LinkedList<>();
//
//        linkedList2.add(56);
//        linkedList2.add(30);
//        linkedList2.add(70);
//        linkedList2.print();

        linkedList1.push(70);
        linkedList1.push(56);
        linkedList1.print();

        linkedList1.insert(30);
        linkedList1.print();
        System.out.println();

        System.out.println("Element being Popped: " + linkedList1.popLast());
        linkedList1.print();
    }
}
