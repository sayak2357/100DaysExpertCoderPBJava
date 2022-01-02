package com.java.gly;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.print("enter first number: ");
        a=sc.nextInt();
        System.out.print("enter second number: ");
        b=sc.nextInt();
        IntClass x = new IntClass(0), y = new IntClass(0);
        System.out.println(extendedGCD(a,b,x,y)+"x = "+x.getVal()+" y = "+y.getVal());
    }
    private static int extendedGCD(int a, int b, IntClass x, IntClass y){
        if(b==0){
            x.setVal(1);
            y.setVal(0);
            return a;
        }
        IntClass x1 = new IntClass(0), y1 = new IntClass(0);
        int result = extendedGCD(b,a%b,x1,y1);
        x.setVal(y1.getVal());
        y.setVal(x1.getVal()-(a/b)*y1.getVal());
        return result;

    }
}
