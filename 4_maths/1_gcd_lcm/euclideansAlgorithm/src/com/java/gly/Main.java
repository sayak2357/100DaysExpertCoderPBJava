package com.java.gly;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();

        System.out.println("gcd of "+a+" and "+b+" is "+gcd(a,b));
    }
    private static int gcd(int a, int b){
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
}
