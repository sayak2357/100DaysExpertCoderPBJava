package com.java.gly;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        boolean end = true;
        while(end){
            System.out.print("1. Insert at beginning\n2. Insert at end\n3. Print Liked list\n4. Exit\n Enter choice: ");
            String choice = sc.next();
            try{
                int choiceInt = Integer.parseInt(choice);
                if(choiceInt==1){
                    System.out.print("enter number: ");
                    int num = sc.nextInt();
                    ll.insertAtFront(num);
                }
                else if(choiceInt==2){
                    System.out.print("enter number: ");
                    int num = sc.nextInt();
                    ll.insertAtEnd(num);
                }
                else if(choiceInt==3){
                    ll.printLL();
                }
                else
                    return;
            } catch (NumberFormatException e){
                return;
            }
        }
    }
}
