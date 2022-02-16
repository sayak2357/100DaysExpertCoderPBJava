package com.java.gly;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Stack<Integer> stack = new Stack<>();
        int num = sc.nextInt();
        while(num!=-3){

            if(num>=0){
                int numInverse = (-1)*num;
                pq.add(numInverse);
                stack.add(num);
            }
            else{
                if(num==-1 && stack.size()>0){
                    int lastNum = stack.pop();
                    if(lastNum == (pq.peek()*(-1))) {
                        pq.poll();
                    }
                }
                else if(num==-2 && stack.size()>0){
                    int rank = pq.peek()*(-1);
                    System.out.println(rank);
                }
            }
            num = sc.nextInt();
        }
    }
}
