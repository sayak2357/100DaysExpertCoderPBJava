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
            int[] arnab =  new int[n];
            int[] dp = new int[n];
            for(int i=0;i<n;i++){
                arnab[i] = sc.nextInt();
            }
            for(int i=0;i<n;i++){
                dp[i] = sc.nextInt();
            }
            Arrays.sort(arnab);
            Arrays.sort(dp);
            int wins = 0, arPointer = 0;
            for(int i=0;i<n;i++){
                while(arPointer<n && arnab[arPointer]<=dp[i]){
                    arPointer++;
                }
                if(arPointer<n){
                    wins++;
                    arPointer++;
                }
                else
                    break;
            }
            System.out.println(wins);
        }
    }
    private static void printArray(int[] arr){
        for(int e: arr){
            System.out.println(e);
        }
    }
}
