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
            int x = sc.nextInt();
            int minDiff = Integer.MAX_VALUE;
            for(int i=0;i<n-2;i++){
                int left = i+1, right = n-1;
                while(left<right){
                    int tempSum = arr[i]+arr[left] + arr[right];
                    minDiff = Integer.min(minDiff,Math.abs(tempSum-x));
                    if(tempSum<x)
                        left++;
                    else
                        right--;
                }
            }
            System.out.println(minDiff);
        }
    }
}
