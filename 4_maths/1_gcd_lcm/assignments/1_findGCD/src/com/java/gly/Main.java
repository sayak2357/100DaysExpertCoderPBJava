package com.java.gly;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.println(gcd(a,b));
        }
    }
    private static int gcd(int a, int b){
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
}
