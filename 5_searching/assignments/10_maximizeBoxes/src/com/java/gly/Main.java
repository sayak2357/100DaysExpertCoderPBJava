package com.java.gly;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int tc = sc.nextInt();
        while(tc-->0){
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            int min = Integer.min(a,b);
            int max = Integer.max(a,b);
            int minAB = Integer.min(min,max);
            if(minAB<=c)
                System.out.println(minAB);
            else {
                int box = Integer.min(minAB,(a+b+c)/3);
                System.out.println(box);
            }
        }
    }
}
