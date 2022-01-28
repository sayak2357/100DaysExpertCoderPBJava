package com.java.gly;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(findImposter(arr));
        }
    }
    private static int findImposter(int[] arr){
        int imposter = 0;
        for(int num: arr){
            imposter = imposter ^ num;
        }
        return imposter;
    }
}
