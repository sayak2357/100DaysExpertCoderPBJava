package com.java.gly;

public class LinkedList {
    Node head = null;
    public void insertAtEnd(int val){
        Node newNode = new Node(val);
        if(head==null) {
            head = newNode;
        }
        else{
            Node p = head;
            while(p.next!=null){
                p = p.next;
            }
            p.next = newNode;
        }
    }
    public void traverse(){
        Node p = head;
        while(p!=null){
            System.out.print(p.data+" => ");
            p = p.next;
        }
        System.out.println("null");
    }
    public void reverseList(){
        Node prev = null;
        Node current = head;
        if(current==null || current.next==null)
            return;
        while(current!=null){
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        head = prev;
    }
}
