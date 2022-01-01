package com.java.gly;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int num = sc.nextInt();
            System.out.println(digitSum(num));
        }
    }
    private static int digitSum(int n){
        return n<10 ? n: n%10+digitSum(n/10);
    }
}
