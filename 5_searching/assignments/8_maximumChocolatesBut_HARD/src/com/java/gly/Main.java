package com.java.gly;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] cumulativePrice = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int priceSum = 0,q;
        for(int i=0;i<n;i++){
            priceSum += arr[i];
            cumulativePrice[i] = priceSum;
        }
        int queryCount = sc.nextInt();
        for(int i=0;i<queryCount;i++){
            int balance = sc.nextInt();
            System.out.println(findMaxBuy(cumulativePrice,n,balance));
        }
    }
    private static int findMaxBuy(int[] arr, int n, int total){
        if(total>=arr[n-1])
            return n;
        if(total<arr[0])
            return 0;
        if(n==1)
            return 1;
        int start = 0, end = n-1;
        while(start<=end){
            int mid = (start + end)/2;
            if(total>=arr[mid] && total<arr[mid+1])
                return mid+1;
            else if(total>arr[mid])
                start = mid;
            else
                end = mid;
        }
        return -1;
    }
}
