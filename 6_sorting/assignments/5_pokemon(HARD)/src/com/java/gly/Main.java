package com.java.gly;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            Integer[] arnab =  new Integer[n];
            Integer[] dp = new Integer[n];
            for(int i=0;i<n;i++){
                arnab[i] = sc.nextInt();
            }
            for(int i=0;i<n;i++){
                dp[i] = sc.nextInt();
            }
            Arrays.sort(arnab, Collections.reverseOrder());
            Arrays.sort(dp, Collections.reverseOrder());
            int wins = 0, dpPointer = 0;
            for(int i=0;i<n;i++){
                while(dpPointer<n && dp[dpPointer]>=arnab[i]){
                    dpPointer++;
                }
                if(dpPointer<n){
                    wins++;
                }
                else
                    break;
            }
            System.out.println(wins);
        }
    }
    private static void printArray(Integer[] arr){
        for(Integer e: arr){
            System.out.println(e);
        }
    }
}
