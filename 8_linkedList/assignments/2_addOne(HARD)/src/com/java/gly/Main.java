package com.java.gly;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        boolean end = false;
        while(!end){
            System.out.print("1. Enter element\n2. Print list\n3. Add one\n4. Exit\nenter choice: ");
            int opt = sc.nextByte();
            if(opt==1){
                System.out.print("enter element: ");
                int num = sc.nextInt();
                ll.insertData(num);
            }
            else if(opt==2){
                ll.printLL();
            }
            else{
                addOne();
            }
            else
                end = true;
        }
    }
}
