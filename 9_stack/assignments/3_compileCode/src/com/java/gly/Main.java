package com.java.gly;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int prefixLength = 0;
            int n = sc.nextInt();
            Stack<Character> stack = new Stack<>();
            String expression = sc.next();
            for(int i=0;i<n;i++){
                if(expression.charAt(i) == '<'){
                    stack.push(expression.charAt(i));
                }
                else{
                    if(!stack.empty()){
                        stack.pop();
                        if(stack.empty()){
                            prefixLength = Integer.max(prefixLength,i+1);
                        }
                    }
                    else{
                        break;
                    }
                }
            }
            System.out.println(prefixLength);

        }
    }
}
