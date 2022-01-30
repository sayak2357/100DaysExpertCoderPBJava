package com.java.gly;
public class LinkedList {
    com.java.gly.SinglyLinkedListNode head = null;
    public void insertData(int data){
        com.java.gly.SinglyLinkedListNode newNode = new com.java.gly.SinglyLinkedListNode(data);
        if(head==null)
            head = newNode;
        else{
            com.java.gly.SinglyLinkedListNode p = head;
            while(p.next!=null){
                p = p.next;
            }
            p.next = newNode;
        }
    }
    public void printLL(){
        com.java.gly.SinglyLinkedListNode p = head;
        while(p!=null){
            System.out.print(p.data+" => ");
            p = p.next;
        }
        System.out.println(" null ");
    }
}
    static SinglyLinkedListNode addOneToList(SinglyLinkedListNode head) {

        head = reverse(head);
        head = addOneUtil(head);
        return reverse(head);

    }
    static SinglyLinkedListNode reverse(SinglyLinkedListNode head){

        SinglyLinkedListNode prev = null;
        SinglyLinkedListNode current = head;
        SinglyLinkedListNode next = null;
        if(head==null || head.next==null)
            return head;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    static SinglyLinkedListNode newNode(int data){

        SinglyLinkedListNode new_node = new SinglyLinkedListNode(data);

        return new_node;
    }
    static SinglyLinkedListNode addOneUtil(SinglyLinkedListNode head)
    {

        SinglyLinkedListNode res = head;
        SinglyLinkedListNode temp = null, prev = null;

        int carry = 1, sum;

        while (head != null)
        {

            sum = carry + head.data;


            carry = (sum >= 10) ? 1 : 0;

            sum = sum % 10;

            head.data = sum;
            temp = head;
            head = head.next;
        }


        if (carry > 0)
            temp.next = newNode(carry);

        return res;
    }
