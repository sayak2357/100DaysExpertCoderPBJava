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
            int box = 0;
            while(min>0 && max>0){
                min--;
                max--;
                if(c>0)
                    c--;
                else{
                    if(max>0) {
                        max--;
                        max = Integer.max(max, min);
                        min = Integer.min(max, min);
                    }
                    else
                        break;
                }
                box++;
            }
            System.out.println(box);
        }
    }
}
