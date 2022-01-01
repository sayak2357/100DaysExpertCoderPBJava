package com.java.gly;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            // 'a' should be >= 'b'
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.println(gcd(a,b));
        }
    }
    private static int gcd(int a, int b){
        return b==0? a:gcd(b,a%b);
    }
}
