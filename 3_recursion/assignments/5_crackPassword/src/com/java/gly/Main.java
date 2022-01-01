package com.java.gly;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            generatePass(n,"");
        }
    }
    private static void generatePass(int n, String generated){
        if(n==0){
            System.out.println(generated);
            return;
        }
        for(int i=1;i<=9;i++){
            generatePass(n-1,generated+i);
        }
    }
}
