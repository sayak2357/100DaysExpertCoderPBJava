package com.java.gly;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            long N = sc.nextLong();
            long M = sc.nextLong();
            long lcm = (N*M)/gcd(N,M);
            System.out.println(lcm);
        }
    }
    private static long gcd(long a, long b){
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
}
