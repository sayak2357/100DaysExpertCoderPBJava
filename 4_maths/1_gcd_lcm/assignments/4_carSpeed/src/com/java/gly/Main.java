package com.java.gly;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            long N = sc.nextLong();
            long M = sc.nextLong();
            long K = sc.nextLong();
            long count = K/findLCM(N,M);
            System.out.println(count);
        }
    }
    private static long findLCM(long a, long b){
        return (a*b)/findGCD(a,b);
    }
    private static long findGCD(long a, long b){
        if(b==0)
            return a;
        return findGCD(b,a%b);
    }
}
