package com.java.gly;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            int num = sc.nextInt();
            System.out.println(stoneNumber(num));
        }
    }
    private static int stoneNumber(int n){
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<=n;i++){
            q.add(i);
        }
        int stoneNumber = -1, answer = -1;
        while(q.size()>1){
            int top = q.remove();
            q.add(top);
            answer = top;
            q.remove();
        }
        return answer;
    }
}
