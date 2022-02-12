package com.java.gly;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<N;i++){
            String opt = sc.next();
            if(opt.equals("E")){
                int num = sc.nextInt();
                q.add(num);
                System.out.println(q.size());
            }
            else{
                int elementDeleted = -1;
                if(q.size()>0){
                    elementDeleted = q.remove();
                }
                System.out.println(elementDeleted+" "+q.size());
            }
        }
    }
}
