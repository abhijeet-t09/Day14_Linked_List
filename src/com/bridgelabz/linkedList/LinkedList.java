package com.bridgelabz.linkedList;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;

    void push(T data) {
        Node<T> node = new Node<>(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    void add(T data){
        Node<T> node = new Node<>(data);
        if(head == null){
            head = node;
            tail = node;
        }
        else{
            tail.next = node;
            tail = node;
        }
    }

    public T pop() {
        T deletedElement = head.data;
        head = head.next;
        return deletedElement;
    }


    public void insert(T data) {
        Node<T> node = new Node<>(data);
        head.next = node;
        node.next = tail;
    }

    public T popLast() {
        T deletedElement = tail.data;
        Node<T> temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }
        temp.next = null;
        temp = tail;
        return  deletedElement;

    }

    void print() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(tail.next);
    }
}
