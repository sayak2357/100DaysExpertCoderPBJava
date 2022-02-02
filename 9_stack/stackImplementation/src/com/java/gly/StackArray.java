package com.java.gly;

public class StackArray {
    int max = 1000;
    int top = -1;
    int[] arr = new int[max];
    public boolean push(int num){
        if(top==max-1) {
            System.out.println("stack is full ...");
            return false;
        }
        arr[++top] = num;
        return true;
    }
    public boolean isEmpty(){
        return top<0;
    }
    public int pop(){
        if(top<0){
            System.out.println("stack is empty ...");
            return -1;
        }
        int data = arr[top];
        top--;
        return data;
    }
}
