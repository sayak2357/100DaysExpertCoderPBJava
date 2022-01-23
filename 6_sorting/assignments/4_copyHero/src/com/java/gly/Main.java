package com.java.gly;

import java.util.Arrays;
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
            Arrays.sort(arr);
            int totalCost = 0;
            for(int i=1 ;i<=n;i++){
                totalCost += Math.abs(arr[i-1] - i);
            }
            System.out.println(totalCost);
        }
    }
}
