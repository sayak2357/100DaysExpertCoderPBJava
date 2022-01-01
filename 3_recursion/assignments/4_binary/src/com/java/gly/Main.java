package com.java.gly;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            printBinary(n, 0, "");
        }
    }
    private static void printBinary(int n, int previous, String generated){
        if(n==0){
            System.out.println(generated);
            return;
        }
        if(previous==0){
            printBinary(n-1,0,generated+"0");
            printBinary(n-1,1,generated+"1");
        }
        else{
            printBinary(n-1,0,generated+"0");
        }
    }
}
