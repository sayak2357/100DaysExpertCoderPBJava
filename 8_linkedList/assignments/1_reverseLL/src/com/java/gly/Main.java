package com.java.gly;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        LinkedList ll = new LinkedList();
        while(!exit){
            System.out.print("1. Insert element\n2. Print LL\n3. Reverse LL\n4. Exit\nenter choice: ");
            int choice = sc.nextInt();
            if(choice==1){
                System.out.print("enter element to be inserted: ");
                int ele = sc.nextInt();
                ll.insertAtEnd(ele);
            }
            else if(choice==2){
                ll.traverse();
            }
            else if(choice==3){
                ll.reverseList();
            }
            else{
                exit = true;
            }
        }
    }
}
