package com.java.gly;

import java.util.Scanner;

public class Main {
    static int[] queue = new int[1000];
    static int top = -1;
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        String ip = sc.next();
        int n = ip.length();
        int i = 0;
        while(i<n){
            char item = ip.charAt(i);
            if(Character.isDigit(item)){
                push(Character.getNumericValue(item));
                i++;
            }
            else{
                if(i<n-1 && !Character.isDigit(ip.charAt(i+1))){
                    pop();
                    i+=2;
                }
                else{
                    top();
                    i++;
                }
            }
        }
    }
    private static void push(int num){
        if(top<999){
            queue[++top] = num;
        }
        else{
            System.out.println("OOPS");
        }
        return;
    }
    private static void pop(){
        if(top>=0)
            top--;
        else
            System.out.println("OOPS");
        return;
    }
    private static void top(){
        if(top>=0)
            System.out.println(queue[top]);
        else
            System.out.println("OOPS");
    }
}
