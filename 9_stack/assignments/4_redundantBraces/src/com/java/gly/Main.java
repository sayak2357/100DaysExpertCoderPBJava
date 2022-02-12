package com.java.gly;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        String operators = "+-*/";
        String input = sc.next();
        int n = input.length(), flag = 0;
        for(int i=0;i<n;i++){
            char item = input.charAt(i);
            if(item=='(' || item!=')')
                stack.push(item);
            else{
                flag = 0;
                while(stack.peek()!='('){
                    char top = stack.peek();
                    if(operators.indexOf(top)>-1) {
                        flag = 1;
                    }
                    stack.pop();
                }
                stack.pop();
                if(flag==0)
                    break;
            }
        }
        if(flag==0)
            System.out.println('1');
        else
            System.out.println('0');
    }
}
