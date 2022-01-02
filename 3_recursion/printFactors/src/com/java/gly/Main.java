package com.java.gly;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int num = sc.nextInt();
            factorise(num,2,"1 ");
        }

    }
    private static void factorise(int num, int p, String factors){
        if(num==1){
            System.out.println(factors);
            return;
        }
        for(int i=p;i<=num;i++){
            if(num%i==0){
                factorise(num/i,i,factors+i+" ");
            }
        }
        return;
    }
}
