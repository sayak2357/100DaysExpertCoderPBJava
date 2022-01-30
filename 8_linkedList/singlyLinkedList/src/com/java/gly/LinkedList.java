package com.java.gly;
class Node{
    int data;
    Node next;
    Node(int val){
        this.data = val;
        this.next = null;
    }
}
public class LinkedList {
    Node head = null;
    public void insertAtFront(int data){
        Node newNode = new Node(data);
        if(head == null)
            head = newNode;
        else{
            newNode.next = head;
            head = newNode;
        }
    }
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        Node p = head;
        if(p==null)
            head = newNode;
        else{
            while(p.next!=null){
                p = p.next;
            }
            p.next = newNode;
        }
    }
    public void printLL(){
        Node p = head;
        if(p == null)
            System.out.println("NULL");
        else{
            while (p!=null){
                System.out.print(p.data+" => ");
                p = p.next;
            }
            System.out.println("NULL");
        }
    }
}
