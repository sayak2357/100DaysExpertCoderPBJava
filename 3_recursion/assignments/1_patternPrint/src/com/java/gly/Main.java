package com.java.gly;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            printPattern(n);
            System.out.println("");
        }
    }
    private static void printPattern(int n){
        System.out.print(n+" ");
        if(n<=0){
            return;
        }
        printPattern(n-5);
        System.out.print(n+" ");
    }
}
