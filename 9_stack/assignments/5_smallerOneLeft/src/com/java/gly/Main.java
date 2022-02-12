package com.java.gly;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        int output[] = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
            output[i] = -1;
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for(int i=1;i<N;i++){
            int speed = arr[i];
            while(!stack.empty() && arr[stack.peek()]>=speed){
                stack.pop();
            }
            if(!stack.empty()){
                output[i] = arr[stack.peek()];
            }
            stack.push(i);
        }
        for(int num:output){
            System.out.print(num+" ");
        }
    }
}
