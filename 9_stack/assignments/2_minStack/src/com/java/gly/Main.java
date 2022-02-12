package com.java.gly;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> mainStack = new Stack<>();
        Stack<Integer> minStack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        int num = 0;
        while(Q-->0){
            int q = sc.nextInt();
            if(q==1){
                num = sc.nextInt();
            }
            if(q==1){
                mainStack.push(num);
                if(minStack.empty() || minStack.peek()>num) {
                    minStack.push(num);
                }
            }
            else if(q==2){
                if(mainStack.empty()){
                    System.out.println("-1");
                }
                else {
                    int topElement = mainStack.peek();
                    if(!minStack.empty() && topElement==minStack.peek()){
                        minStack.pop();
                    }
                    mainStack.pop();
                }
            }
            else if(q==3){
                if(mainStack.empty()){
                    System.out.println("-1");
                }
                else {
                    System.out.println(mainStack.peek());
                }
            }
            else{
                if(mainStack.empty()){
                    System.out.println("-1");
                }
                else{
                    System.out.println(minStack.peek());
                }
            }
        }
    }
}
