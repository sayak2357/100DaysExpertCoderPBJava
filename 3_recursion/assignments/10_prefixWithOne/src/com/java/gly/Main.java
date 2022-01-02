package com.java.gly;

import java.util.Scanner;

public class Main {
    private static String output;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            output = "";
            generateBinaryStrings(n,0,0,"");
            System.out.println(output);
        }
    }
    private static void generateBinaryStrings(int n, int zeroCount, int oneCount, String generated){
        if(n==0)
            output+=generated+" ";
        else{
            if(zeroCount==oneCount)
                generateBinaryStrings(n-1,zeroCount,oneCount+1,generated+"1");
            else{
                generateBinaryStrings(n-1,zeroCount,oneCount+1,generated+"1");
                generateBinaryStrings(n-1,zeroCount+1,oneCount,generated+"0");
            }
        }
        return;
    }
}
